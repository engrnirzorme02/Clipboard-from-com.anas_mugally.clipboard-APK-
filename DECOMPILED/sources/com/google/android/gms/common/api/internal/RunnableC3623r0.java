package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC3718s;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.r0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3623r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C3619p0 f14684a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC3625s0 f14685b;

    RunnableC3623r0(AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s0, C3619p0 c3619p0) {
        this.f14685b = abstractDialogInterfaceOnCancelListenerC3625s0;
        this.f14684a = c3619p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14685b.f14686a) {
            C1837b c1837bM17935b = this.f14684a.m17935b();
            if (c1837bM17935b.m7599W()) {
                AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s0 = this.f14685b;
                abstractDialogInterfaceOnCancelListenerC3625s0.mLifecycleFragment.startActivityForResult(GoogleApiActivity.m17740a(abstractDialogInterfaceOnCancelListenerC3625s0.getActivity(), (PendingIntent) AbstractC3718s.m18083l(c1837bM17935b.m7598V()), this.f14684a.m17934a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s1 = this.f14685b;
            if (abstractDialogInterfaceOnCancelListenerC3625s1.f14689d.mo7605b(abstractDialogInterfaceOnCancelListenerC3625s1.getActivity(), c1837bM17935b.m7596T(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s2 = this.f14685b;
                abstractDialogInterfaceOnCancelListenerC3625s2.f14689d.m7621w(abstractDialogInterfaceOnCancelListenerC3625s2.getActivity(), abstractDialogInterfaceOnCancelListenerC3625s2.mLifecycleFragment, c1837bM17935b.m7596T(), 2, this.f14685b);
                return;
            }
            if (c1837bM17935b.m7596T() != 18) {
                this.f14685b.m17936a(c1837bM17935b, this.f14684a.m17934a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s3 = this.f14685b;
            Dialog dialogM7616r = abstractDialogInterfaceOnCancelListenerC3625s3.f14689d.m7616r(abstractDialogInterfaceOnCancelListenerC3625s3.getActivity(), abstractDialogInterfaceOnCancelListenerC3625s3);
            AbstractDialogInterfaceOnCancelListenerC3625s0 abstractDialogInterfaceOnCancelListenerC3625s4 = this.f14685b;
            abstractDialogInterfaceOnCancelListenerC3625s4.f14689d.m7617s(abstractDialogInterfaceOnCancelListenerC3625s4.getActivity().getApplicationContext(), new C3621q0(this, dialogM7616r));
        }
    }
}
