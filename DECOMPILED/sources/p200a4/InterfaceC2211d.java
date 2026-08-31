package p200a4;

import java.util.Set;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2211d {
    /* JADX INFO: renamed from: a */
    default Object mo8953a(Class cls) {
        return mo8954b(C2206E.m8952b(cls));
    }

    /* JADX INFO: renamed from: b */
    default Object mo8954b(C2206E c2206e) {
        InterfaceC2972b interfaceC2972bMo8957f = mo8957f(c2206e);
        if (interfaceC2972bMo8957f == null) {
            return null;
        }
        return interfaceC2972bMo8957f.get();
    }

    /* JADX INFO: renamed from: c */
    default InterfaceC2972b mo8955c(Class cls) {
        return mo8957f(C2206E.m8952b(cls));
    }

    /* JADX INFO: renamed from: d */
    InterfaceC2971a mo8956d(C2206E c2206e);

    /* JADX INFO: renamed from: e */
    default Set m8989e(Class cls) {
        return mo8959h(C2206E.m8952b(cls));
    }

    /* JADX INFO: renamed from: f */
    InterfaceC2972b mo8957f(C2206E c2206e);

    /* JADX INFO: renamed from: g */
    InterfaceC2972b mo8958g(C2206E c2206e);

    /* JADX INFO: renamed from: h */
    default Set mo8959h(C2206E c2206e) {
        return (Set) mo8958g(c2206e).get();
    }

    /* JADX INFO: renamed from: i */
    default InterfaceC2971a mo8960i(Class cls) {
        return mo8956d(C2206E.m8952b(cls));
    }
}
