package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.AbstractC2733f;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p050G0.InterfaceC0467a;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0467a {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    private static class C2726a {
        /* JADX INFO: renamed from: a */
        public static Handler m12850a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C2727b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m12847h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: w0.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2733f.m12895h(context);
            }
        });
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: a */
    public List mo2029a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2727b mo2030b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: w0.c
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                this.f29125a.m12849g(applicationContext);
            }
        });
        return new C2727b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g */
    public void m12849g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C2726a.m12850a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: w0.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m12847h(context);
            }
        }, new Random().nextInt(Math.max(zzbbn.zzq.zzf, 1)) + 5000);
    }
}
