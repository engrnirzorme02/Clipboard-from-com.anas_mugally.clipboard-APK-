package com.anas_mugally.clipboard.p221ui.p222ai.utils;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import com.anas_mugally.clipboard.R;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.utils.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3137d {

    /* JADX INFO: renamed from: a */
    private final GradientDrawable f13107a;

    /* JADX INFO: renamed from: b */
    private final int[] f13108b;

    /* JADX INFO: renamed from: c */
    private float f13109c;

    public C3137d(Context context, boolean z7) {
        AbstractC6118n.m27187e(context, "context");
        int[] iArr = (context.getResources().getConfiguration().uiMode & 48) == 32 ? new int[]{Color.parseColor("#2C3E50"), Color.parseColor("#34495E"), Color.parseColor("#1A252F"), Color.parseColor("#2C3E50")} : new int[]{Color.parseColor("#EBF4FD"), Color.parseColor("#C9E1FA"), Color.parseColor("#A8D0F7"), Color.parseColor("#EBF4FD")};
        this.f13108b = iArr;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 3);
        AbstractC6118n.m27186d(iArrCopyOf, "copyOf(...)");
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArrCopyOf);
        this.f13107a = gradientDrawable;
        float dimension = context.getResources().getDimension(R.dimen.my_app_radius);
        gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
        m16405f();
    }

    /* JADX INFO: renamed from: b */
    private final int m16402b(Integer[] numArr, float f7) {
        float length = f7 * (numArr.length - 1);
        int iG = AbstractC5905g.m26659g((int) length, 0, numArr.length - 2);
        return m16404e(numArr[iG].intValue(), numArr[AbstractC5905g.m26659g(iG + 1, 0, numArr.length - 1)].intValue(), length - iG);
    }

    /* JADX INFO: renamed from: c */
    private final int[] m16403c() {
        int[] iArr = new int[3];
        int i7 = 0;
        while (i7 < 3) {
            double dSin = (Math.sin((float) ((((double) (this.f13109c * 2)) * 3.141592653589793d) + ((((double) (i7 * 2)) * 3.141592653589793d) / ((double) 3)))) + 1.0d) / 2.0d;
            int i8 = i7 + 1;
            int[] iArr2 = this.f13108b;
            iArr[i7] = m16402b(new Integer[]{Integer.valueOf(iArr2[i7]), Integer.valueOf(this.f13108b[i8 % (iArr2.length - 1)]), Integer.valueOf(this.f13108b[(i7 + 2) % (iArr2.length - 1)])}, (float) dSin);
            i7 = i8;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    private final int m16404e(int i7, int i8, float f7) {
        float f8 = AbstractC5905g.m26658f(f7, 0.0f, 1.0f);
        float f9 = 1.0f - f8;
        return Color.argb(AbstractC5905g.m26659g((int) ((Color.alpha(i7) * f9) + (Color.alpha(i8) * f8)), 0, 255), AbstractC5905g.m26659g((int) ((Color.red(i7) * f9) + (Color.red(i8) * f8)), 0, 255), AbstractC5905g.m26659g((int) ((Color.green(i7) * f9) + (Color.green(i8) * f8)), 0, 255), AbstractC5905g.m26659g((int) ((Color.blue(i7) * f9) + (Color.blue(i8) * f8)), 0, 255));
    }

    /* JADX INFO: renamed from: f */
    private final void m16405f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(15000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anas_mugally.clipboard.ui.ai.utils.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3137d.m16406g(this.f13106a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m16406g(C3137d c3137d, ValueAnimator animation) {
        AbstractC6118n.m27187e(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c3137d.f13109c = ((Float) animatedValue).floatValue();
        c3137d.f13107a.setColors(c3137d.m16403c());
    }

    /* JADX INFO: renamed from: d */
    public final GradientDrawable m16407d() {
        return this.f13107a;
    }
}
