package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import java.util.Map;
import p325p3.AbstractC6741b;
import p333q3.C6831f;
import p333q3.C6833h;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: t */
    private Map f18229t;

    public FabTransformationSheetBehavior() {
    }

    /* JADX INFO: renamed from: f0 */
    private void m21822f0(View view, boolean z7) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                this.f18229t = new HashMap(childCount);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                boolean z8 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C2426f) && (((CoordinatorLayout.C2426f) childAt.getLayoutParams()).m10530f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z8) {
                    if (z7) {
                        this.f18229t.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        Map map = this.f18229t;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f18229t.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z7) {
                return;
            }
            this.f18229t = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: L */
    protected boolean mo21801L(View view, View view2, boolean z7, boolean z8) {
        m21822f0(view2, z7);
        return super.mo21801L(view, view2, z7, z8);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: d0 */
    protected FabTransformationBehavior.C4679b mo21820d0(Context context, boolean z7) {
        int i7 = z7 ? AbstractC6741b.f26215h : AbstractC6741b.f26214g;
        FabTransformationBehavior.C4679b c4679b = new FabTransformationBehavior.C4679b();
        c4679b.f18222a = C6831f.m29854d(context, i7);
        c4679b.f18223b = new C6833h(17, 0.0f, 0.0f);
        return c4679b;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
