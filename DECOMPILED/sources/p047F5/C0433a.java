package p047F5;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p015B5.C0092b;
import p055G5.AbstractC0486a;

/* JADX INFO: renamed from: F5.a */
/* JADX INFO: loaded from: classes.dex */
public class C0433a extends C0092b implements InterfaceC0434b {

    /* JADX INFO: renamed from: o0 */
    private final List f1697o0 = new ArrayList();

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        this.f1697o0.addAll(AbstractC0486a.m2085a(view));
    }

    @Override // p047F5.InterfaceC0434b
    /* JADX INFO: renamed from: e */
    public void mo1870e(float f7) {
        AbstractC0486a.m2086b(this.f1697o0, f7);
    }
}
