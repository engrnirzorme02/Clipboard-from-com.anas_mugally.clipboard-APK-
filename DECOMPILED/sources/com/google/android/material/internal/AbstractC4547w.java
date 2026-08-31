package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: com.google.android.material.internal.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4547w extends ImageButton {

    /* JADX INFO: renamed from: a */
    private int f17387a;

    public AbstractC4547w(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17387a = getVisibility();
    }

    /* JADX INFO: renamed from: b */
    public final void m20839b(int i7, boolean z7) {
        super.setVisibility(i7);
        if (z7) {
            this.f17387a = i7;
        }
    }

    public final int getUserSetVisibility() {
        return this.f17387a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        m20839b(i7, true);
    }
}
