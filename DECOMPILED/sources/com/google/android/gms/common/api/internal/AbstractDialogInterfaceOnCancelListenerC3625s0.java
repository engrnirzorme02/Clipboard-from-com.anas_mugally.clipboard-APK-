package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC2636b;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import p170W2.C1837b;
import p170W2.C1840e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC3625s0 extends AbstractC3606j implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    protected volatile boolean f14686a;

    /* JADX INFO: renamed from: b */
    protected final AtomicReference f14687b;

    /* JADX INFO: renamed from: c */
    private final Handler f14688c;

    /* JADX INFO: renamed from: d */
    protected final C1840e f14689d;

    AbstractDialogInterfaceOnCancelListenerC3625s0(InterfaceC3608k interfaceC3608k, C1840e c1840e) {
        super(interfaceC3608k);
        this.f14687b = new AtomicReference(null);
        this.f14688c = new zau(Looper.getMainLooper());
        this.f14689d = c1840e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m17936a(C1837b c1837b, int i7) {
        this.f14687b.set(null);
        mo17793b(c1837b, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m17937d() {
        this.f14687b.set(null);
        mo17794c();
    }

    /* JADX INFO: renamed from: e */
    private static final int m17938e(C3619p0 c3619p0) {
        if (c3619p0 == null) {
            return -1;
        }
        return c3619p0.m17934a();
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo17793b(C1837b c1837b, int i7);

    /* JADX INFO: renamed from: c */
    protected abstract void mo17794c();

    /* JADX INFO: renamed from: h */
    public final void m17941h(C1837b c1837b, int i7) {
        AtomicReference atomicReference;
        C3619p0 c3619p0 = new C3619p0(c1837b, i7);
        do {
            atomicReference = this.f14687b;
            if (AbstractC2636b.m12603a(atomicReference, null, c3619p0)) {
                this.f14688c.post(new RunnableC3623r0(this, c3619p0));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onActivityResult(int i7, int i8, Intent intent) {
        C3619p0 c3619p0 = (C3619p0) this.f14687b.get();
        if (i7 != 1) {
            if (i7 == 2) {
                int iMo7608g = this.f14689d.mo7608g(getActivity());
                if (iMo7608g == 0) {
                    m17937d();
                    return;
                } else {
                    if (c3619p0 == null) {
                        return;
                    }
                    if (c3619p0.m17935b().m7596T() == 18 && iMo7608g == 18) {
                        return;
                    }
                }
            }
        } else if (i8 == -1) {
            m17937d();
            return;
        } else if (i8 == 0) {
            if (c3619p0 != null) {
                m17936a(new C1837b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c3619p0.m17935b().toString()), m17938e(c3619p0));
                return;
            }
            return;
        }
        if (c3619p0 != null) {
            m17936a(c3619p0.m17935b(), c3619p0.m17934a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m17936a(new C1837b(13, null), m17938e((C3619p0) this.f14687b.get()));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14687b.set(bundle.getBoolean("resolving_error", false) ? new C3619p0(new C1837b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C3619p0 c3619p0 = (C3619p0) this.f14687b.get();
        if (c3619p0 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c3619p0.m17934a());
        bundle.putInt("failed_status", c3619p0.m17935b().m7596T());
        bundle.putParcelable("failed_resolution", c3619p0.m17935b().m7598V());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public void onStart() {
        super.onStart();
        this.f14686a = true;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3606j
    public void onStop() {
        super.onStop();
        this.f14686a = false;
    }
}
