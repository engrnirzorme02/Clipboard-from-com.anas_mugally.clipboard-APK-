package p404z2;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: z2.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7603t {
    /* JADX INFO: renamed from: a */
    public static Object m33337a(Context context, String str, InterfaceC7601r interfaceC7601r) throws C7602s {
        try {
            return interfaceC7601r.zza(m33339c(context).m18233d(str));
        } catch (Exception e7) {
            throw new C7602s(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m33338b(Context context) {
        return m33339c(context).m18232b();
    }

    /* JADX INFO: renamed from: c */
    private static DynamiteModule m33339c(Context context) throws C7602s {
        try {
            return DynamiteModule.m18224e(context, DynamiteModule.f14923b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e7) {
            throw new C7602s(e7);
        }
    }
}
