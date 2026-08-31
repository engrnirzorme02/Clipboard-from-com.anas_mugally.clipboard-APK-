package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5088a implements InterfaceC5082U {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.protobuf.a$a */
    public static abstract class a implements InterfaceC5082U.a {
        /* JADX INFO: renamed from: j */
        protected static void m23072j(Iterable iterable, List list) {
            AbstractC5063B.m22837a(iterable);
            if (!(iterable instanceof InterfaceC5071I)) {
                if (iterable instanceof InterfaceC5099f0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m23073k(iterable, list);
                    return;
                }
            }
            List listMo22919t = ((InterfaceC5071I) iterable).mo22919t();
            InterfaceC5071I interfaceC5071I = (InterfaceC5071I) list;
            int size = list.size();
            for (Object obj : listMo22919t) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC5071I.size() - size) + " is null.";
                    for (int size2 = interfaceC5071I.size() - 1; size2 >= size; size2--) {
                        interfaceC5071I.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC5104i) {
                    interfaceC5071I.mo22918o((AbstractC5104i) obj);
                } else {
                    interfaceC5071I.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        private static void m23073k(Iterable iterable, List list) {
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

        /* JADX INFO: renamed from: l */
        protected static C5127t0 m23074l(InterfaceC5082U interfaceC5082U) {
            return new C5127t0(interfaceC5082U);
        }
    }

    /* JADX INFO: renamed from: j */
    protected static void m23068j(Iterable iterable, List list) {
        a.m23072j(iterable, list);
    }

    /* JADX INFO: renamed from: l */
    private String m23069l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: e */
    public void mo22971e(OutputStream outputStream) {
        AbstractC5110l abstractC5110lM23360a0 = AbstractC5110l.m23360a0(outputStream, AbstractC5110l.m23341E(mo22969b()));
        mo22972f(abstractC5110lM23360a0);
        abstractC5110lM23360a0.mo23408X();
    }

    @Override // com.google.protobuf.InterfaceC5082U
    /* JADX INFO: renamed from: h */
    public byte[] mo22973h() {
        try {
            byte[] bArr = new byte[mo22969b()];
            AbstractC5110l abstractC5110lM23361b0 = AbstractC5110l.m23361b0(bArr);
            mo22972f(abstractC5110lM23361b0);
            abstractC5110lM23361b0.m23411d();
            return bArr;
        } catch (IOException e7) {
            throw new RuntimeException(m23069l("byte array"), e7);
        }
    }

    /* JADX INFO: renamed from: k */
    abstract int mo23070k(InterfaceC5113m0 interfaceC5113m0);

    /* JADX INFO: renamed from: n */
    C5127t0 m23071n() {
        return new C5127t0(this);
    }
}
