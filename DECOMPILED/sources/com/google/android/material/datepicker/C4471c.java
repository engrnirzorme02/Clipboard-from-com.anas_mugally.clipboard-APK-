package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p045F3.AbstractC0422b;
import p045F3.AbstractC0423c;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes2.dex */
final class C4471c {

    /* JADX INFO: renamed from: a */
    final C4470b f16867a;

    /* JADX INFO: renamed from: b */
    final C4470b f16868b;

    /* JADX INFO: renamed from: c */
    final C4470b f16869c;

    /* JADX INFO: renamed from: d */
    final C4470b f16870d;

    /* JADX INFO: renamed from: e */
    final C4470b f16871e;

    /* JADX INFO: renamed from: f */
    final C4470b f16872f;

    /* JADX INFO: renamed from: g */
    final C4470b f16873g;

    /* JADX INFO: renamed from: h */
    final Paint f16874h;

    C4471c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0422b.m1822f(context, AbstractC6742c.f26286z, C4482n.class.getCanonicalName()), AbstractC6752m.f26676K3);
        this.f16867a = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26720O3, 0));
        this.f16873g = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26698M3, 0));
        this.f16868b = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26709N3, 0));
        this.f16869c = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26731P3, 0));
        ColorStateList colorStateListM1825a = AbstractC0423c.m1825a(context, typedArrayObtainStyledAttributes, AbstractC6752m.f26742Q3);
        this.f16870d = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26764S3, 0));
        this.f16871e = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26753R3, 0));
        this.f16872f = C4470b.m20259a(context, typedArrayObtainStyledAttributes.getResourceId(AbstractC6752m.f26775T3, 0));
        Paint paint = new Paint();
        this.f16874h = paint;
        paint.setColor(colorStateListM1825a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
