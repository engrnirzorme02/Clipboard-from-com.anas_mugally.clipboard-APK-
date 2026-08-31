package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3606j {
    protected final InterfaceC3608k mLifecycleFragment;

    protected AbstractC3606j(InterfaceC3608k interfaceC3608k) {
        this.mLifecycleFragment = interfaceC3608k;
    }

    public static InterfaceC3608k getFragment(Activity activity) {
        return getFragment(new C3604i(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityMo17925d = this.mLifecycleFragment.mo17925d();
        AbstractC3718s.m18083l(activityMo17925d);
        return activityMo17925d;
    }

    public void onActivityResult(int i7, int i8, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC3608k getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static InterfaceC3608k getFragment(C3604i c3604i) {
        if (c3604i.m17907d()) {
            return C3639z0.m17968Q1(c3604i.m17905b());
        }
        if (c3604i.m17906c()) {
            return FragmentC3633w0.m17952b(c3604i.m17904a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
