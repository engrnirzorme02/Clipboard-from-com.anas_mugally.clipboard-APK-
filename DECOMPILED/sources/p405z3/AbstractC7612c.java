package p405z3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.AbstractC4543s;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: z3.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7612c {
    /* JADX INFO: renamed from: a */
    public static Rect m33369a(Context context, int i7, int i8) {
        TypedArray typedArrayM20818i = AbstractC4543s.m20818i(context, null, AbstractC6752m.f26686L2, i7, i8, new int[0]);
        int dimensionPixelSize = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26719O2, context.getResources().getDimensionPixelSize(AbstractC6744e.f26326U));
        int dimensionPixelSize2 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26730P2, context.getResources().getDimensionPixelSize(AbstractC6744e.f26327V));
        int dimensionPixelSize3 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26708N2, context.getResources().getDimensionPixelSize(AbstractC6744e.f26325T));
        int dimensionPixelSize4 = typedArrayM20818i.getDimensionPixelSize(AbstractC6752m.f26697M2, context.getResources().getDimensionPixelSize(AbstractC6744e.f26324S));
        typedArrayM20818i.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i9 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i9, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    /* JADX INFO: renamed from: b */
    public static InsetDrawable m33370b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
