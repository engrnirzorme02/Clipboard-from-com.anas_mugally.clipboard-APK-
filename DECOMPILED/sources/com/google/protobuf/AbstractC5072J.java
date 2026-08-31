package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.J */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5072J {

    /* JADX INFO: renamed from: a */
    private static final AbstractC5072J f19331a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC5072J f19332b;

    /* JADX INFO: renamed from: com.google.protobuf.J$b */
    private static final class b extends AbstractC5072J {

        /* JADX INFO: renamed from: c */
        private static final Class f19333c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        /* JADX INFO: renamed from: f */
        static List m22925f(Object obj, long j7) {
            return (List) AbstractC5137y0.m23735G(obj, j7);
        }

        /* JADX INFO: renamed from: g */
        private static List m22926g(Object obj, long j7, int i7) {
            List listMo22823d;
            List listM22925f = m22925f(obj, j7);
            if (listM22925f.isEmpty()) {
                if (listM22925f instanceof InterfaceC5071I) {
                    listMo22823d = new C5070H(i7);
                } else {
                    listMo22823d = ((listM22925f instanceof InterfaceC5099f0) && (listM22925f instanceof AbstractC5063B.e)) ? ((AbstractC5063B.e) listM22925f).mo22823d(i7) : new ArrayList(i7);
                }
                AbstractC5137y0.m23750V(obj, j7, listMo22823d);
                return listMo22823d;
            }
            if (f19333c.isAssignableFrom(listM22925f.getClass())) {
                ArrayList arrayList = new ArrayList(listM22925f.size() + i7);
                arrayList.addAll(listM22925f);
                AbstractC5137y0.m23750V(obj, j7, arrayList);
                return arrayList;
            }
            if (listM22925f instanceof C5135x0) {
                C5070H c5070h = new C5070H(listM22925f.size() + i7);
                c5070h.addAll((C5135x0) listM22925f);
                AbstractC5137y0.m23750V(obj, j7, c5070h);
                return c5070h;
            }
            if ((listM22925f instanceof InterfaceC5099f0) && (listM22925f instanceof AbstractC5063B.e)) {
                AbstractC5063B.e eVar = (AbstractC5063B.e) listM22925f;
                if (!eVar.mo22849h()) {
                    AbstractC5063B.e eVarMo22823d = eVar.mo22823d(listM22925f.size() + i7);
                    AbstractC5137y0.m23750V(obj, j7, eVarMo22823d);
                    return eVarMo22823d;
                }
            }
            return listM22925f;
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: c */
        void mo22922c(Object obj, long j7) {
            Object objUnmodifiableList;
            List list = (List) AbstractC5137y0.m23735G(obj, j7);
            if (list instanceof InterfaceC5071I) {
                objUnmodifiableList = ((InterfaceC5071I) list).mo22911J();
            } else {
                if (f19333c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC5099f0) && (list instanceof AbstractC5063B.e)) {
                    AbstractC5063B.e eVar = (AbstractC5063B.e) list;
                    if (eVar.mo22849h()) {
                        eVar.mo22848c();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC5137y0.m23750V(obj, j7, objUnmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: d */
        void mo22923d(Object obj, Object obj2, long j7) {
            List listM22925f = m22925f(obj2, j7);
            List listM22926g = m22926g(obj, j7, listM22925f.size());
            int size = listM22926g.size();
            int size2 = listM22925f.size();
            if (size > 0 && size2 > 0) {
                listM22926g.addAll(listM22925f);
            }
            if (size > 0) {
                listM22925f = listM22926g;
            }
            AbstractC5137y0.m23750V(obj, j7, listM22925f);
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: e */
        List mo22924e(Object obj, long j7) {
            return m22926g(obj, j7, 10);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.J$c */
    private static final class c extends AbstractC5072J {
        private c() {
            super();
        }

        /* JADX INFO: renamed from: f */
        static AbstractC5063B.e m22927f(Object obj, long j7) {
            return (AbstractC5063B.e) AbstractC5137y0.m23735G(obj, j7);
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: c */
        void mo22922c(Object obj, long j7) {
            m22927f(obj, j7).mo22848c();
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: d */
        void mo22923d(Object obj, Object obj2, long j7) {
            AbstractC5063B.e eVarM22927f = m22927f(obj, j7);
            AbstractC5063B.e eVarM22927f2 = m22927f(obj2, j7);
            int size = eVarM22927f.size();
            int size2 = eVarM22927f2.size();
            if (size > 0 && size2 > 0) {
                if (!eVarM22927f.mo22849h()) {
                    eVarM22927f = eVarM22927f.mo22823d(size2 + size);
                }
                eVarM22927f.addAll(eVarM22927f2);
            }
            if (size > 0) {
                eVarM22927f2 = eVarM22927f;
            }
            AbstractC5137y0.m23750V(obj, j7, eVarM22927f2);
        }

        @Override // com.google.protobuf.AbstractC5072J
        /* JADX INFO: renamed from: e */
        List mo22924e(Object obj, long j7) {
            AbstractC5063B.e eVarM22927f = m22927f(obj, j7);
            if (eVarM22927f.mo22849h()) {
                return eVarM22927f;
            }
            int size = eVarM22927f.size();
            AbstractC5063B.e eVarMo22823d = eVarM22927f.mo22823d(size == 0 ? 10 : size * 2);
            AbstractC5137y0.m23750V(obj, j7, eVarMo22823d);
            return eVarMo22823d;
        }
    }

    static {
        f19331a = new b();
        f19332b = new c();
    }

    /* JADX INFO: renamed from: a */
    static AbstractC5072J m22920a() {
        return f19331a;
    }

    /* JADX INFO: renamed from: b */
    static AbstractC5072J m22921b() {
        return f19332b;
    }

    /* JADX INFO: renamed from: c */
    abstract void mo22922c(Object obj, long j7);

    /* JADX INFO: renamed from: d */
    abstract void mo22923d(Object obj, Object obj2, long j7);

    /* JADX INFO: renamed from: e */
    abstract List mo22924e(Object obj, long j7);

    private AbstractC5072J() {
    }
}
