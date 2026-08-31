package p000;

import android.app.Activity;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5379f {

    /* JADX INFO: renamed from: a */
    private final Activity f20489a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5356a f20490b;

    /* JADX INFO: renamed from: c */
    private int f20491c;

    public C5379f(Activity activity, InterfaceC5356a onPermissionGranted) {
        AbstractC6118n.m27187e(activity, "activity");
        AbstractC6118n.m27187e(onPermissionGranted, "onPermissionGranted");
        this.f20489a = activity;
        this.f20490b = onPermissionGranted;
    }

    /* JADX INFO: renamed from: b */
    private final void m24385b(final long j7) {
        new Handler(this.f20489a.getMainLooper()).postDelayed(new Runnable() { // from class: e
            @Override // java.lang.Runnable
            public final void run() {
                C5379f.m24386c(this.f19998a, j7);
            }
        }, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m24386c(C5379f c5379f, long j7) {
        if (c5379f.f20489a.isDestroyed() || c5379f.f20489a.isFinishing()) {
            return;
        }
        Log.d("anas_checked", "checkPermission");
        if (Settings.canDrawOverlays(c5379f.f20489a)) {
            c5379f.f20491c = 0;
            c5379f.f20490b.invoke();
            return;
        }
        int i7 = c5379f.f20491c;
        if (i7 < 4000) {
            c5379f.f20491c = i7 + ((int) j7);
            c5379f.m24385b(j7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m24387e(C5379f c5379f, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = 100;
        }
        c5379f.m24388d(j7);
    }

    /* JADX INFO: renamed from: d */
    public final void m24388d(long j7) {
        m24385b(j7);
    }
}
