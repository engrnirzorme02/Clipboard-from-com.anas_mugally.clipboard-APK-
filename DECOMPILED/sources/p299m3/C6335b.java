package p299m3;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.internal.C3690e;
import p307n3.C6483a;

/* JADX INFO: renamed from: m3.b */
/* JADX INFO: loaded from: classes2.dex */
final class C6335b extends C3553a.a {
    C6335b() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* bridge */ /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        return new C6483a(context, looper, true, c3690e, C6483a.m27651e(c3690e), bVar, cVar);
    }
}
