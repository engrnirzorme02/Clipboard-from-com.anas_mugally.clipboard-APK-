package com.bumptech.glide.load.data;

import java.io.InputStream;
import p043F1.InterfaceC0404b;
import p091L1.C0801V;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3226k implements InterfaceC3220e {

    /* JADX INFO: renamed from: a */
    private final C0801V f13825a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC3220e.a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0404b f13826a;

        public a(InterfaceC0404b interfaceC0404b) {
            this.f13826a = interfaceC0404b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: a */
        public Class mo4043a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3220e mo4044b(InputStream inputStream) {
            return new C3226k(inputStream, this.f13826a);
        }
    }

    public C3226k(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        C0801V c0801v = new C0801V(inputStream, interfaceC0404b);
        this.f13825a = c0801v;
        c0801v.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: b */
    public void mo4041b() {
        this.f13825a.m3749n();
    }

    /* JADX INFO: renamed from: c */
    public void m17127c() {
        this.f13825a.m3748m();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo4040a() {
        this.f13825a.reset();
        return this.f13825a;
    }
}
