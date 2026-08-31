package p396y2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.C3501u;

/* JADX INFO: renamed from: y2.q */
/* JADX INFO: loaded from: classes.dex */
final class C7529q extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    final C3501u f30140a;

    /* JADX INFO: renamed from: b */
    boolean f30141b;

    public C7529q(Context context, String str, String str2, String str3) {
        super(context);
        C3501u c3501u = new C3501u(context, str);
        this.f30140a = c3501u;
        c3501u.m17569d(str2);
        c3501u.m17568c(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30141b) {
            return false;
        }
        this.f30140a.m17566a(motionEvent);
        return false;
    }
}
