package p285k5;

import android.content.Context;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;

/* JADX INFO: renamed from: k5.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6073h {

    /* JADX INFO: renamed from: k5.h$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        String mo7417a(Object obj);
    }

    /* JADX INFO: renamed from: b */
    public static C2210c m27112b(String str, String str2) {
        return C2210c.m8967l(AbstractC6071f.m27110a(str, str2), AbstractC6071f.class);
    }

    /* JADX INFO: renamed from: c */
    public static C2210c m27113c(final String str, final a aVar) {
        return C2210c.m8968m(AbstractC6071f.class).m8983b(C2224q.m9033l(Context.class)).m8987f(new InterfaceC2214g() { // from class: k5.g
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return AbstractC6071f.m27110a(str, aVar.mo7417a((Context) interfaceC2211d.mo8953a(Context.class)));
            }
        }).m8985d();
    }
}
