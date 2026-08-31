package p093L3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.C2268d;
import p255h.AbstractC5520a;
import p325p3.AbstractC6742c;

/* JADX INFO: renamed from: L3.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0842a {

    /* JADX INFO: renamed from: a */
    private static final int[] f3323a = {R.attr.theme, AbstractC5520a.f20960K};

    /* JADX INFO: renamed from: b */
    private static final int[] f3324b = {AbstractC6742c.f26222G};

    /* JADX INFO: renamed from: a */
    private static int m3881a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3323a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* JADX INFO: renamed from: b */
    private static int[] m3882b(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
            for (int i9 = 0; i9 < iArr.length; i9++) {
                iArr2[i9] = typedArrayObtainStyledAttributes.getResourceId(i9, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: c */
    private static int m3883c(Context context, AttributeSet attributeSet, int i7, int i8) {
        return m3882b(context, attributeSet, f3324b, i7, i8)[0];
    }

    /* JADX INFO: renamed from: d */
    public static Context m3884d(Context context, AttributeSet attributeSet, int i7, int i8) {
        return m3885e(context, attributeSet, i7, i8, new int[0]);
    }

    /* JADX INFO: renamed from: e */
    public static Context m3885e(Context context, AttributeSet attributeSet, int i7, int i8, int[] iArr) {
        int iM3883c = m3883c(context, attributeSet, i7, i8);
        boolean z7 = (context instanceof C2268d) && ((C2268d) context).m9382c() == iM3883c;
        if (iM3883c == 0 || z7) {
            return context;
        }
        C2268d c2268d = new C2268d(context, iM3883c);
        for (int i9 : m3882b(context, attributeSet, iArr, i7, i8)) {
            if (i9 != 0) {
                c2268d.getTheme().applyStyle(i9, true);
            }
        }
        int iM3881a = m3881a(context, attributeSet);
        if (iM3881a != 0) {
            c2268d.getTheme().applyStyle(iM3881a, true);
        }
        return c2268d;
    }
}
