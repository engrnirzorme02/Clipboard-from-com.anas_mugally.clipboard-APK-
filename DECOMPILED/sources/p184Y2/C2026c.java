package p184Y2;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.common.internal.C3732z;

/* JADX INFO: renamed from: Y2.c */
/* JADX INFO: loaded from: classes.dex */
final class C2026c extends C3553a.a {
    C2026c() {
    }

    @Override // com.google.android.gms.common.api.C3553a.a
    public final /* synthetic */ C3553a.f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        return new C2028e(context, looper, c3690e, (C3732z) obj, interfaceC3598f, interfaceC3616o);
    }
}
