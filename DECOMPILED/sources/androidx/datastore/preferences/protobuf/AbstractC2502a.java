package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2502a implements InterfaceC2486J {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a implements InterfaceC2486J.a {
        /* JADX INFO: renamed from: e */
        protected static void m11040e(Iterable iterable, List list) {
            AbstractC2534u.m11637a(iterable);
            m11041f(iterable, list);
        }

        /* JADX INFO: renamed from: f */
        private static void m11041f(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        /* JADX INFO: renamed from: g */
        protected static C2511e0 m11042g(InterfaceC2486J interfaceC2486J) {
            return new C2511e0(interfaceC2486J);
        }
    }

    /* JADX INFO: renamed from: e */
    protected static void m11036e(Iterable iterable, List list) {
        a.m11040e(iterable, list);
    }

    /* JADX INFO: renamed from: f */
    abstract int mo11037f(InterfaceC2500Y interfaceC2500Y);

    /* JADX INFO: renamed from: g */
    C2511e0 m11038g() {
        return new C2511e0(this);
    }

    /* JADX INFO: renamed from: h */
    public void m11039h(OutputStream outputStream) {
        AbstractC2518i abstractC2518iM11315Y = AbstractC2518i.m11315Y(outputStream, AbstractC2518i.m11296C(mo10896b()));
        mo10898d(abstractC2518iM11315Y);
        abstractC2518iM11315Y.mo11358V();
    }
}
