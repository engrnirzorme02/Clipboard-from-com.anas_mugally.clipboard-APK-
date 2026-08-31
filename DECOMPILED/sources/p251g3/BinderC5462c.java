package p251g3;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: g3.c */
/* JADX INFO: loaded from: classes.dex */
final class BinderC5462c extends zzq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f20765a;

    BinderC5462c(C5460a c5460a, TaskCompletionSource taskCompletionSource) {
        this.f20765a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        AbstractC3634x.m17954b(status, pendingIntent, this.f20765a);
    }
}
