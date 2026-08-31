package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p337r.AbstractC6870a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final int f8357a;

    /* JADX INFO: renamed from: b */
    private final int f8358b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8357a = getResources().getDimensionPixelOffset(AbstractC6870a.f27499b);
        this.f8358b = getResources().getDimensionPixelOffset(AbstractC6870a.f27498a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f8357a * 2), this.f8358b), 1073741824), i8);
    }
}
