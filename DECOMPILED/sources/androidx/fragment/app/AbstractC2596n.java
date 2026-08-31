package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.content.AbstractC2436b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p104N.AbstractC0910g;
import p256h0.AbstractC5540k;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2596n extends AbstractC5540k {

    /* JADX INFO: renamed from: a */
    private final Activity f10225a;

    /* JADX INFO: renamed from: b */
    private final Context f10226b;

    /* JADX INFO: renamed from: c */
    private final Handler f10227c;

    /* JADX INFO: renamed from: d */
    private final int f10228d;

    /* JADX INFO: renamed from: e */
    final AbstractC2599q f10229e;

    AbstractC2596n(AbstractActivityC2592j abstractActivityC2592j) {
        this(abstractActivityC2592j, abstractActivityC2592j, new Handler(), 0);
    }

    /* JADX INFO: renamed from: i */
    Activity m12268i() {
        return this.f10225a;
    }

    /* JADX INFO: renamed from: j */
    Context m12269j() {
        return this.f10226b;
    }

    /* JADX INFO: renamed from: k */
    public Handler m12270k() {
        return this.f10227c;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo12239m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: n */
    public abstract Object mo12240n();

    /* JADX INFO: renamed from: o */
    public abstract LayoutInflater mo12241o();

    /* JADX INFO: renamed from: p */
    public void m12271p(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Intent intent, int i7, Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC2436b.startActivity(this.f10226b, intent, bundle);
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo12242q();

    AbstractC2596n(Activity activity, Context context, Handler handler, int i7) {
        this.f10229e = new C2600r();
        this.f10225a = activity;
        this.f10226b = (Context) AbstractC0910g.m4140h(context, "context == null");
        this.f10227c = (Handler) AbstractC0910g.m4140h(handler, "handler == null");
        this.f10228d = i7;
    }
}
