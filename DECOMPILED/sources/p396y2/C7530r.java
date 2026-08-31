package p396y2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcek;

/* JADX INFO: renamed from: y2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7530r {

    /* JADX INFO: renamed from: a */
    public final int f30142a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f30143b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f30144c;

    /* JADX INFO: renamed from: d */
    public final Context f30145d;

    public C7530r(zzcek zzcekVar) throws C7528p {
        this.f30143b = zzcekVar.getLayoutParams();
        ViewParent parent = zzcekVar.getParent();
        this.f30145d = zzcekVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new C7528p("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f30144c = viewGroup;
        this.f30142a = viewGroup.indexOfChild(zzcekVar.zzE());
        viewGroup.removeView(zzcekVar.zzE());
        zzcekVar.zzag(true);
    }
}
