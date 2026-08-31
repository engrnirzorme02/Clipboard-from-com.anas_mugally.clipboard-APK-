package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.google.android.material.datepicker.y */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4493y extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: o0 */
    protected final LinkedHashSet f17016o0 = new LinkedHashSet();

    AbstractC4493y() {
    }

    /* JADX INFO: renamed from: Q1 */
    boolean mo20325Q1(AbstractC4492x abstractC4492x) {
        return this.f17016o0.add(abstractC4492x);
    }

    /* JADX INFO: renamed from: R1 */
    void m20411R1() {
        this.f17016o0.clear();
    }
}
