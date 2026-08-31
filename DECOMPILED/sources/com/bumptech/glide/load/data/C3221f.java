package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.f */
/* JADX INFO: loaded from: classes.dex */
public class C3221f {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC3220e.a f13810b = new a();

    /* JADX INFO: renamed from: a */
    private final Map f13811a = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$a */
    class a implements InterfaceC3220e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: a */
        public Class mo4043a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: b */
        public InterfaceC3220e mo4044b(Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.f$b */
    private static final class b implements InterfaceC3220e {

        /* JADX INFO: renamed from: a */
        private final Object f13812a;

        b(Object obj) {
            this.f13812a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e
        /* JADX INFO: renamed from: a */
        public Object mo4040a() {
            return this.f13812a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e
        /* JADX INFO: renamed from: b */
        public void mo4041b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC3220e m17114a(Object obj) {
        InterfaceC3220e.a aVar;
        try {
            AbstractC2022k.m8408e(obj);
            aVar = (InterfaceC3220e.a) this.f13811a.get(obj.getClass());
            if (aVar == null) {
                for (InterfaceC3220e.a aVar2 : this.f13811a.values()) {
                    if (aVar2.mo4043a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f13810b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.mo4044b(obj);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m17115b(InterfaceC3220e.a aVar) {
        this.f13811a.put(aVar.mo4043a(), aVar);
    }
}
