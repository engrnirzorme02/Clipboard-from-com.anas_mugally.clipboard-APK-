package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.widget.c0 */
/* JADX INFO: loaded from: classes.dex */
class C2346c0 extends AbstractC2337W {

    /* JADX INFO: renamed from: b */
    private final WeakReference f8213b;

    public C2346c0(Context context, Resources resources) {
        super(resources);
        this.f8213b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Drawable drawableM9976a = m9976a(i7);
        Context context = (Context) this.f8213b.get();
        if (drawableM9976a != null && context != null) {
            C2335V.m9949g().m9965w(context, i7, drawableM9976a);
        }
        return drawableM9976a;
    }
}
