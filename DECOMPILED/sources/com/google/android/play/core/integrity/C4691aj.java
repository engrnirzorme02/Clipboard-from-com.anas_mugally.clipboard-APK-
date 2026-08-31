package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractBinderC4757A;
import com.google.android.play.integrity.internal.AbstractC4780j;
import com.google.android.play.integrity.internal.AbstractC4788r;
import com.google.android.play.integrity.internal.C4763G;
import com.google.android.play.integrity.internal.C4776f;
import com.google.android.play.integrity.internal.InterfaceC4770N;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.aj */
/* JADX INFO: loaded from: classes2.dex */
final class C4691aj {

    /* JADX INFO: renamed from: a */
    final C4776f f18253a;

    /* JADX INFO: renamed from: b */
    private final C4763G f18254b;

    /* JADX INFO: renamed from: c */
    private final String f18255c;

    /* JADX INFO: renamed from: d */
    private final C4701at f18256d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC4739k f18257e;

    C4691aj(Context context, C4763G c4763g, C4701at c4701at, InterfaceC4739k interfaceC4739k) {
        this.f18255c = context.getPackageName();
        this.f18254b = c4763g;
        this.f18256d = c4701at;
        this.f18257e = interfaceC4739k;
        if (AbstractC4780j.m21925b(context)) {
            this.f18253a = new C4776f(context, c4763g, "IntegrityService", C4692ak.f18258a, new InterfaceC4770N() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.InterfaceC4770N
                /* JADX INFO: renamed from: a */
                public final Object mo21832a(IBinder iBinder) {
                    return AbstractBinderC4757A.m21885L0(iBinder);
                }
            }, null);
        } else {
            c4763g.m21891b("Phonesky is not installed.", new Object[0]);
            this.f18253a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ Bundle m21837a(C4691aj c4691aj, byte[] bArr, Long l7, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c4691aj.f18255c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l7 != null) {
            bundle.putLong("cloud.prj", l7.longValue());
        }
        ArrayList arrayList = new ArrayList();
        AbstractC4788r.m21934b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC4788r.m21933a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    final Task m21842b(Activity activity, Bundle bundle) {
        if (this.f18253a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f18254b.m21893d("requestAndShowDialog(%s, %s)", this.f18255c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18253a.m21919t(new C4688ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: c */
    public final Task m21843c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f18253a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof C4696ao) {
            }
            this.f18254b.m21893d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f18253a.m21919t(new C4687af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e7) {
            return Tasks.forException(new IntegrityServiceException(-13, e7));
        }
    }
}
