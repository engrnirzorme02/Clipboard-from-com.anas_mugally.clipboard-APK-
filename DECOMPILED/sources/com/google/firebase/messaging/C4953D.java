package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.firebase.messaging.D */
/* JADX INFO: loaded from: classes.dex */
public class C4953D implements Closeable {

    /* JADX INFO: renamed from: a */
    private final URL f18784a;

    /* JADX INFO: renamed from: b */
    private volatile Future f18785b;

    /* JADX INFO: renamed from: c */
    private Task f18786c;

    private C4953D(URL url) {
        this.f18784a = url;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22258d(C4953D c4953d, TaskCompletionSource taskCompletionSource) {
        c4953d.getClass();
        try {
            taskCompletionSource.setResult(c4953d.m22263m());
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    /* JADX INFO: renamed from: n */
    private byte[] m22259n() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f18784a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM22446d = AbstractC4978b.m22446d(AbstractC4978b.m22444b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrM22446d.length + " bytes from " + this.f18784a);
            }
            if (bArrM22446d.length <= 1048576) {
                return bArrM22446d;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public static C4953D m22260x(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C4953D(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public Task m22261J() {
        return (Task) AbstractC3718s.m18083l(this.f18786c);
    }

    /* JADX INFO: renamed from: Q */
    public void m22262Q(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18785b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.C
            @Override // java.lang.Runnable
            public final void run() {
                C4953D.m22258d(this.f18782a, taskCompletionSource);
            }
        });
        this.f18786c = taskCompletionSource.getTask();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18785b.cancel(true);
    }

    /* JADX INFO: renamed from: m */
    public Bitmap m22263m() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f18784a);
        }
        byte[] bArrM22259n = m22259n();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM22259n, 0, bArrM22259n.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f18784a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f18784a);
        }
        return bitmapDecodeByteArray;
    }
}
