package p087K5;

import java.io.IOException;

/* JADX INFO: renamed from: K5.i */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0760i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a */
    private final String f3092a;

    EnumC0760i(String str) {
        this.f3092a = str;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC0760i m3588c(String str) throws IOException {
        EnumC0760i enumC0760i = HTTP_1_0;
        if (str.equals(enumC0760i.f3092a)) {
            return enumC0760i;
        }
        EnumC0760i enumC0760i2 = HTTP_1_1;
        if (str.equals(enumC0760i2.f3092a)) {
            return enumC0760i2;
        }
        EnumC0760i enumC0760i3 = HTTP_2;
        if (str.equals(enumC0760i3.f3092a)) {
            return enumC0760i3;
        }
        EnumC0760i enumC0760i4 = SPDY_3;
        if (str.equals(enumC0760i4.f3092a)) {
            return enumC0760i4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3092a;
    }
}
