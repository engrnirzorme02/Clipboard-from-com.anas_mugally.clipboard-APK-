package p121P2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.internal.p410authapiphone.zzw;

/* JADX INFO: renamed from: P2.c */
/* JADX INFO: loaded from: classes.dex */
final class C1196c extends C3553a.a {
    C1196c() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        return new zzw(context, looper, c3690e, interfaceC3598f, interfaceC3616o);
    }
}
