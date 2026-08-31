package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3639z0 extends AbstractComponentCallbacksC2591i implements InterfaceC3608k {

    /* JADX INFO: renamed from: p0 */
    private static final WeakHashMap f14709p0 = new WeakHashMap();

    /* JADX INFO: renamed from: o0 */
    private final C3637y0 f14710o0 = new C3637y0();

    /* JADX INFO: renamed from: Q1 */
    public static C3639z0 m17968Q1(AbstractActivityC2592j abstractActivityC2592j) {
        C3639z0 c3639z0;
        WeakHashMap weakHashMap = f14709p0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC2592j);
        if (weakReference != null && (c3639z0 = (C3639z0) weakReference.get()) != null) {
            return c3639z0;
        }
        try {
            C3639z0 c3639z1 = (C3639z0) abstractActivityC2592j.m12232H0().m12379h0("SLifecycleFragmentImpl");
            if (c3639z1 == null || c3639z1.m12182l0()) {
                c3639z1 = new C3639z0();
                abstractActivityC2592j.m12232H0().m12391n().m12507d(c3639z1, "SLifecycleFragmentImpl").mo12017h();
            }
            weakHashMap.put(abstractActivityC2592j, new WeakReference(c3639z1));
            return c3639z1;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: A0 */
    public final void mo675A0() {
        super.mo675A0();
        this.f14710o0.m17963h();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: Q0 */
    public final void mo680Q0() {
        super.mo680Q0();
        this.f14710o0.m17964i();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public final void mo12080R0(Bundle bundle) {
        super.mo12080R0(bundle);
        this.f14710o0.m17965j(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: S0 */
    public final void mo12081S0() {
        super.mo12081S0();
        this.f14710o0.m17966k();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: T0 */
    public final void mo5868T0() {
        super.mo5868T0();
        this.f14710o0.m17967l();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: a */
    public final void mo17923a(String str, AbstractC3606j abstractC3606j) {
        this.f14710o0.m17959d(str, abstractC3606j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: c */
    public final AbstractC3606j mo17924c(String str, Class cls) {
        return this.f14710o0.m17958c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: d */
    public final Activity mo17925d() {
        return m12184m();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: i */
    public final void mo12173i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo12173i(str, fileDescriptor, printWriter, strArr);
        this.f14710o0.m17960e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: q0 */
    public final void mo12194q0(int i7, int i8, Intent intent) {
        super.mo12194q0(i7, i8, intent);
        this.f14710o0.m17961f(i7, i8, intent);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public final void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        this.f14710o0.m17962g(bundle);
    }
}
