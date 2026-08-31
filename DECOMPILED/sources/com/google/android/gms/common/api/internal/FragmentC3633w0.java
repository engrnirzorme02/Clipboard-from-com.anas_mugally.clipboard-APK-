package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC3633w0 extends Fragment implements InterfaceC3608k {

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f14699b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    private final C3637y0 f14700a = new C3637y0();

    /* JADX INFO: renamed from: b */
    public static FragmentC3633w0 m17952b(Activity activity) {
        FragmentC3633w0 fragmentC3633w0;
        WeakHashMap weakHashMap = f14699b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC3633w0 = (FragmentC3633w0) weakReference.get()) != null) {
            return fragmentC3633w0;
        }
        try {
            FragmentC3633w0 fragmentC3633w1 = (FragmentC3633w0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC3633w1 == null || fragmentC3633w1.isRemoving()) {
                fragmentC3633w1 = new FragmentC3633w0();
                activity.getFragmentManager().beginTransaction().add(fragmentC3633w1, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC3633w1));
            return fragmentC3633w1;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: a */
    public final void mo17923a(String str, AbstractC3606j abstractC3606j) {
        this.f14700a.m17959d(str, abstractC3606j);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: c */
    public final AbstractC3606j mo17924c(String str, Class cls) {
        return this.f14700a.m17958c(str, cls);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3608k
    /* JADX INFO: renamed from: d */
    public final Activity mo17925d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f14700a.m17960e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f14700a.m17961f(i7, i8, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14700a.m17962g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f14700a.m17963h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f14700a.m17964i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f14700a.m17965j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f14700a.m17966k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f14700a.m17967l();
    }
}
