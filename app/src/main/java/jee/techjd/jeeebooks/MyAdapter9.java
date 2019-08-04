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

public class MyAdapter9 extends RecyclerView.Adapter<MyViewHolder> {


    Main15Activity main15Activity;

    ArrayList<DownModel> downModels;

    public MyAdapter9(Main15Activity main15Activity, ArrayList<DownModel> downModels) {
        this.main15Activity = main15Activity;
        this.downModels = downModels;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater9 = LayoutInflater.from(main15Activity.getBaseContext());
        View view9 = layoutInflater9.inflate(R.layout.elements, null, false);

        return new MyViewHolder(view9);


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