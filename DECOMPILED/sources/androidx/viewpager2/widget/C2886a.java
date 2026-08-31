package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.viewpager2.widget.a */
/* JADX INFO: loaded from: classes.dex */
final class C2886a {

    /* JADX INFO: renamed from: b */
    private static final ViewGroup.MarginLayoutParams f11812b;

    /* JADX INFO: renamed from: a */
    private LinearLayoutManager f11813a;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.a$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f11812b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C2886a(LinearLayoutManager linearLayoutManager) {
        this.f11813a = linearLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    private boolean m14429a() {
        int top;
        int i7;
        int bottom;
        int i8;
        int iM13407P = this.f11813a.m13407P();
        if (iM13407P == 0) {
            return true;
        }
        boolean z7 = this.f11813a.m13061q2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM13407P, 2);
        for (int i9 = 0; i9 < iM13407P; i9++) {
            View viewM13405O = this.f11813a.m13405O(i9);
            if (viewM13405O == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewM13405O.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f11812b;
            int[] iArr2 = iArr[i9];
            if (z7) {
                top = viewM13405O.getLeft();
                i7 = marginLayoutParams.leftMargin;
            } else {
                top = viewM13405O.getTop();
                i7 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i7;
            int[] iArr3 = iArr[i9];
            if (z7) {
                bottom = viewM13405O.getRight();
                i8 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewM13405O.getBottom();
                i8 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i8;
        }
        Arrays.sort(iArr, new a());
        for (int i10 = 1; i10 < iM13407P; i10++) {
            if (iArr[i10 - 1][1] != iArr[i10][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i11 = iArr4[1];
        int i12 = iArr4[0];
        return i12 <= 0 && iArr[iM13407P - 1][1] >= i11 - i12;
    }

    /* JADX INFO: renamed from: b */
    private boolean m14430b() {
        int iM13407P = this.f11813a.m13407P();
        for (int i7 = 0; i7 < iM13407P; i7++) {
            if (m14431c(this.f11813a.m13405O(i7))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m14431c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (m14431c(viewGroup.getChildAt(i7))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    boolean m14432d() {
        return (!m14429a() || this.f11813a.m13407P() <= 1) && m14430b();
    }
}
