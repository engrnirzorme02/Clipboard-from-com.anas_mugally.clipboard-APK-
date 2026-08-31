package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5052m;
import com.google.gson.EnumC5056q;
import com.google.gson.InterfaceC5057r;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5039i extends AbstractC5059s {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC5060t f19119b = m22697f(EnumC5056q.f19246b);

    /* JADX INFO: renamed from: a */
    private final InterfaceC5057r f19120a;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.i$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            if (c5058a.m22814c() == Number.class) {
                return C5039i.this;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.i$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19122a;

        static {
            int[] iArr = new int[EnumC7416b.values().length];
            f19122a = iArr;
            try {
                iArr[EnumC7416b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19122a[EnumC7416b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19122a[EnumC7416b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C5039i(InterfaceC5057r interfaceC5057r) {
        this.f19120a = interfaceC5057r;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC5060t m22696e(InterfaceC5057r interfaceC5057r) {
        return interfaceC5057r == EnumC5056q.f19246b ? f19119b : m22697f(interfaceC5057r);
    }

    /* JADX INFO: renamed from: f */
    private static InterfaceC5060t m22697f(InterfaceC5057r interfaceC5057r) {
        return new C5039i(interfaceC5057r).new a();
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number mo22636b(C7415a c7415a) throws IOException {
        EnumC7416b enumC7416bM32824d1 = c7415a.m32824d1();
        int i7 = b.f19122a[enumC7416bM32824d1.ordinal()];
        if (i7 == 1) {
            c7415a.m32821Z0();
            return null;
        }
        if (i7 == 2 || i7 == 3) {
            return this.f19120a.mo22805c(c7415a);
        }
        throw new C5052m("Expecting number, got: " + enumC7416bM32824d1 + "; at path " + c7415a.m32831q0());
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Number number) throws IOException {
        c7417c.mo22686e1(number);
    }
}
