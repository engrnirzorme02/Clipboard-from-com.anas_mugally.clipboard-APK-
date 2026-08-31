package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a */
    private final BinderC2461a f9379a = new BinderC2461a();

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderMetadataHolder$a */
    public final class BinderC2461a extends Binder {
        public BinderC2461a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        return this.f9379a;
    }
}
