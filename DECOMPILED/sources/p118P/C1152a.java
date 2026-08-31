package p118P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: P.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1152a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    private final int f4081a;

    /* JADX INFO: renamed from: b */
    private final C1170s f4082b;

    /* JADX INFO: renamed from: c */
    private final int f4083c;

    public C1152a(int i7, C1170s c1170s, int i8) {
        this.f4081a = i7;
        this.f4082b = c1170s;
        this.f4083c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4081a);
        this.f4082b.m5055d0(this.f4083c, bundle);
    }
}
