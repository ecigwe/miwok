package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;

public class Numbers extends AppCompatActivity {
//    private MediaPlayer mMediaPlayer;
//    private AudioManager mAudioManager;
//
//    /**
//     * This listener gets triggered when the {@link MediaPlayer} has completed
//     * playing the audio file.
//     */
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };
//
//    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
//            new AudioManager.OnAudioFocusChangeListener() {
//                @Override
//                public void onAudioFocusChange(int focusChange) {
//                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                        mMediaPlayer.pause();
//                        mMediaPlayer.seekTo(0);
//
//                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                        //resume playback
//                        mMediaPlayer.start();
//                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                        releaseMediaPlayer();
//
//                    }
//
//                }
//            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
//        //create and set up mAudioManager to request audio focus
//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
////        String[] words = new String[10];
////        words[0] = "one";
////        words[1]= "two";
////        words[2]= "three";
////        words[3]= "four";
////        words[4]= "five";
////        words[5]= "six";
////        words[6]= "seven";
////        words[7]="eight";
////        words[9]="nine";
////        words[10]="ten";
//
////        ArrayList<String> words = new ArrayList <String>();
////          words.add("one");
////          words.add("two");
////          words.add("three");
////          words.add("four");
//
//        //create a list of words
//
//        final ArrayList<Word> words = new ArrayList<Word>();
////        words.add(new Word("one", "lutti"));
////        words.add(new Word("two", "ottico"));
////        words.add(new Word("three", "tolokoosu"));
////        words.add(new Word("four", "oyyisa"));
////        words.add(new Word("five", "massoca"));
////        words.add(new Word("six", "temmoka"));
////        words.add(new Word("seven", "kenukeka"));
////        words.add(new Word("eight", "kawinta"));
////        words.add(new Word("nine", "woe"));
////        words.add(new Word("ten", "ashas"));
////        words.add(new Word("one", "lutti"));
////        words.add(new Word("one", "lutti"));
//
//        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
//        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
//        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_one));
//
//
////              LinearLayout rootview = (LinearLayout) findViewById(R.id.rootView);
////              TextView wordview = new TextView(this);
////              wordview.setText(words.get(0));
////              rootview.addView(wordview);
//
////        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.list_item, words);
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(adapter);
//
////        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
////            @Override
////            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
////                Toast.makeText(Numbers.this, "list item called", Toast.LENGTH_SHORT).show();
////            }
////        });
//
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Word word = words.get(position);
////                Toast.makeText(Numbers.this, "list item called", Toast.LENGTH_SHORT).show();
//
//                // Release the media player if it currently exists because we are about to
//                // play a different sound file
//                releaseMediaPlayer();
//                //request audio focus for playbacks
//
//                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                        //use the music stream
//                        AudioManager.STREAM_MUSIC,
//                        //request permanent focus
//                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//
//                    // mAudioManager.registerMediaButtonEventReciever(RemoteControlReciever);
//                    //start playback
//
//
//                    mMediaPlayer = MediaPlayer.create(Numbers.this, word.getAudioResourceId());
//                    mMediaPlayer.start();
//                    //              this could be st as global variable
//                    //                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    //                    @Override
//                    //                    public void onCompletion(MediaPlayer mediaPlayer) {
//                    ////                        releaseMediaPlayer();
//                    //                    }
//                    //                });
//                    // Setup a listener on the media player, so that we can stop and release the
//                    // media player once the sound has finished playing.
//                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
//                }
//            }
//        });
//    }
//
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        //when activity stop release media player
//        releaseMediaPlayer();
//    }
//
//    /**
//     * Clean up the media player by releasing its resources.
//     */
//    private void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//            //relaease audio manager when not need
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }


    }
}
