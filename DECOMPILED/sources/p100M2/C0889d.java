package p100M2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.internal.p409authapi.zbd;

/* JADX INFO: renamed from: M2.d */
/* JADX INFO: loaded from: classes.dex */
final class C0889d extends C3553a.a {
    C0889d() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        return new zbd(context, looper, c3690e, (C0892g) obj, bVar, cVar);
    }
}
