package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C4488t<S> extends AbstractC4493y {

    /* JADX INFO: renamed from: p0 */
    private int f16990p0;

    /* JADX INFO: renamed from: q0 */
    private InterfaceC4477i f16991q0;

    /* JADX INFO: renamed from: r0 */
    private C4469a f16992r0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.t$a */
    class a extends AbstractC4492x {
        a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC4492x
        /* JADX INFO: renamed from: a */
        public void mo20364a() {
            Iterator it = C4488t.this.f17016o0.iterator();
            while (it.hasNext()) {
                ((AbstractC4492x) it.next()).mo20364a();
            }
        }

        @Override // com.google.android.material.datepicker.AbstractC4492x
        /* JADX INFO: renamed from: b */
        public void mo20365b(Object obj) {
            Iterator it = C4488t.this.f17016o0.iterator();
            while (it.hasNext()) {
                ((AbstractC4492x) it.next()).mo20365b(obj);
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    static C4488t m20373S1(InterfaceC4477i interfaceC4477i, int i7, C4469a c4469a) {
        C4488t c4488t = new C4488t();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC4477i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4469a);
        c4488t.m12117E1(bundle);
        return c4488t;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle bundle) {
        super.mo12080R0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16990p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16991q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16992r0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (bundle == null) {
            bundle = m12199s();
        }
        this.f16990p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f16991q0 = (InterfaceC4477i) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16992r0 = (C4469a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f16991q0.mo20284x(layoutInflater.cloneInContext(new ContextThemeWrapper(m12204u(), this.f16990p0)), viewGroup, bundle, this.f16992r0, new a());
    }
}
