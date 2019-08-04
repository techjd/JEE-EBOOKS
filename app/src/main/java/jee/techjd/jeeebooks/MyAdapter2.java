package jee.techjd.jeeebooks;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jee.techjd.jeeebooks.R;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyViewHolder> {


    Main4Activity main4Activity;

    ArrayList<DownModel> downModels;

    public MyAdapter2(Main4Activity main4Activity, ArrayList<DownModel> downModels) {
        this.main4Activity = main4Activity;
        this.downModels = downModels;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater2 = LayoutInflater.from(main4Activity.getBaseContext());
        View view2 = layoutInflater2.inflate(R.layout.elements, null, false);

        return new MyViewHolder(view2);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {

        myViewHolder.mName.setText(downModels.get(i).getName());
        myViewHolder.mLink.setText(downModels.get(i).getLink());
        myViewHolder.mDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadFile(myViewHolder.mName.getContext(),downModels.get(i).getName(),".pdf",DIRECTORY_DOWNLOADS,downModels.get(i).getLink());
            }
        });


    }

    public void downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadmanager = (DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse(url);
        DownloadManager.Request request = new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, destinationDirectory, fileName + fileExtension);

        downloadmanager.enqueue(request);
    }


    @Override
    public int getItemCount() {
        return downModels.size();
    }
}

