package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C2390a;
import com.google.android.gms.internal.common.zzh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y0 */
/* JADX INFO: loaded from: classes.dex */
final class C3637y0 {

    /* JADX INFO: renamed from: a */
    private final Map f14704a = Collections.synchronizedMap(new C2390a());

    /* JADX INFO: renamed from: b */
    private int f14705b = 0;

    /* JADX INFO: renamed from: c */
    private Bundle f14706c;

    C3637y0() {
    }

    /* JADX INFO: renamed from: c */
    final AbstractC3606j m17958c(String str, Class cls) {
        return (AbstractC3606j) cls.cast(this.f14704a.get(str));
    }

    /* JADX INFO: renamed from: d */
    final void m17959d(String str, AbstractC3606j abstractC3606j) {
        if (this.f14704a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f14704a.put(str, abstractC3606j);
        if (this.f14705b > 0) {
            new zzh(Looper.getMainLooper()).post(new RunnableC3635x0(this, abstractC3606j, str));
        }
    }

    /* JADX INFO: renamed from: e */
    final void m17960e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: f */
    final void m17961f(int i7, int i8, Intent intent) {
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).onActivityResult(i7, i8, intent);
        }
    }

    /* JADX INFO: renamed from: g */
    final void m17962g(Bundle bundle) {
        this.f14705b = 1;
        this.f14706c = bundle;
        for (Map.Entry entry : this.f14704a.entrySet()) {
            ((AbstractC3606j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX INFO: renamed from: h */
    final void m17963h() {
        this.f14705b = 5;
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: i */
    final void m17964i() {
        this.f14705b = 3;
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).onResume();
        }
    }

    /* JADX INFO: renamed from: j */
    final void m17965j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f14704a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC3606j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX INFO: renamed from: k */
    final void m17966k() {
        this.f14705b = 2;
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).onStart();
        }
    }

    /* JADX INFO: renamed from: l */
    final void m17967l() {
        this.f14705b = 4;
        Iterator it = this.f14704a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC3606j) it.next()).onStop();
        }
    }
}
