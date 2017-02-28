package com.example.android.tourguide;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.widget.ImageView.ScaleType.CENTER_CROP;

public class SightAdapter extends ArrayAdapter<Sight> {

    private int mColorResourceId;
    private boolean isExpanded = false;

    public SightAdapter(Activity context, ArrayList<Sight> sights, int colorResourceId) {
        super(context, 0, sights);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LinearLayout sightLinearLayout = (LinearLayout) listItemView.findViewById(R.id.sights);
        sightLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        final Sight currentSight = getItem(position);
        if (currentSight.hasImage()) {
            iconView.setImageResource(currentSight.getImageResourceId());
            iconView.setScaleType(CENTER_CROP);
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }
        TextView sightNameTextView = (TextView) listItemView.findViewById(R.id.sight_name_text_view);
        sightNameTextView.setText(currentSight.getSightName());
        final TextView sightDescriptionTextView = (TextView) listItemView.findViewById(R.id.sight_description_text_view);
        sightDescriptionTextView.setText(currentSight.getSightDescription());

        //View more expandable/collapsible text

        final View newListItemView = listItemView;

        sightDescriptionTextView.post(new Runnable() {
            @Override
            public void run() {
                int lineCount = sightDescriptionTextView.getLineCount();
                // Perform any actions you want based on the line count here.
                final ImageView btnSeeMore = (ImageView) newListItemView.findViewById(R.id.view_more_button);
                if (lineCount > 5) {

                    btnSeeMore.setVisibility(View.VISIBLE);

                    //Click on sightDescriptionTextView
                    newListItemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //showAll.setVisibility(View.INVISIBLE);
                            if (!isExpanded) {
                                isExpanded = true;
                                ObjectAnimator animation = ObjectAnimator.ofInt(sightDescriptionTextView, "maxLines", 40);
                                animation.setDuration(500).start();
                                //sightDescriptionTextView.setMaxLines(Integer.MAX_VALUE);
                                btnSeeMore.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_collapse));
                            } else {
                                isExpanded = false;
                                ObjectAnimator animation = ObjectAnimator.ofInt(sightDescriptionTextView, "maxLines", 5);
                                animation.setDuration(500).start();
                                //sightDescriptionTextView.setMaxLines(3);
                                btnSeeMore.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_expand));

                            }
                        }
                    });
                } else {
                    btnSeeMore.setVisibility(View.GONE);
                }
            }
        });

        return listItemView;
    }

}
