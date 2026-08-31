package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC4792v;
import com.google.android.play.integrity.internal.AbstractC4788r;
import com.google.android.play.integrity.internal.C4763G;
import com.google.android.play.integrity.internal.C4776f;
import com.google.android.play.integrity.internal.InterfaceC4770N;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bn */
/* JADX INFO: loaded from: classes2.dex */
final class C4722bn {

    /* JADX INFO: renamed from: a */
    final C4776f f18316a;

    /* JADX INFO: renamed from: b */
    private final C4763G f18317b;

    /* JADX INFO: renamed from: c */
    private final String f18318c;

    /* JADX INFO: renamed from: d */
    private final TaskCompletionSource f18319d;

    /* JADX INFO: renamed from: e */
    private final C4701at f18320e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC4739k f18321f;

    C4722bn(Context context, C4763G c4763g, C4701at c4701at, InterfaceC4739k interfaceC4739k) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18319d = taskCompletionSource;
        this.f18318c = context.getPackageName();
        this.f18317b = c4763g;
        this.f18320e = c4701at;
        this.f18321f = interfaceC4739k;
        C4776f c4776f = new C4776f(context, c4763g, "ExpressIntegrityService", C4723bo.f18322a, new InterfaceC4770N() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.InterfaceC4770N
            /* JADX INFO: renamed from: a */
            public final Object mo21832a(IBinder iBinder) {
                return AbstractBinderC4792v.m21941L0(iBinder);
            }
        }, null);
        this.f18316a = c4776f;
        c4776f.m21917c().post(new C4713be(this, taskCompletionSource, context));
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ Bundle m21861a(C4722bn c4722bn, String str, long j7, long j8, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c4722bn.f18318c);
        bundle.putLong("cloud.prj", j7);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC4788r.m21934b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC4788r.m21933a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    static /* bridge */ /* synthetic */ Bundle m21862b(C4722bn c4722bn, long j7, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c4722bn.f18318c);
        bundle.putLong("cloud.prj", j7);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC4788r.m21934b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC4788r.m21933a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    static /* bridge */ /* synthetic */ boolean m21868k(C4722bn c4722bn) {
        return c4722bn.f18319d.getTask().isSuccessful() && ((Integer) c4722bn.f18319d.getTask().getResult()).intValue() == 0;
    }

    /* JADX INFO: renamed from: c */
    final Task m21869c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f18317b.m21893d("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18316a.m21919t(new C4716bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: d */
    public final Task m21870d(String str, long j7, long j8, int i7) {
        this.f18317b.m21893d("requestExpressIntegrityToken(%s)", Long.valueOf(j8));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18316a.m21919t(new C4715bg(this, taskCompletionSource, 0, str, j7, j8, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: e */
    public final Task m21871e(long j7, int i7) {
        this.f18317b.m21893d("warmUpIntegrityToken(%s)", Long.valueOf(j7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18316a.m21919t(new C4714bf(this, taskCompletionSource, 0, j7, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
