package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p145S5.C1426d;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: F6.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0456q {
    /* JADX INFO: renamed from: a */
    public static final C0454o m1962a(Number value, String output) {
        AbstractC6118n.m27187e(value, "value");
        AbstractC6118n.m27187e(output, "output");
        return new C0454o("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m1969h(output, 0, 1, null)));
    }

    /* JADX INFO: renamed from: b */
    public static final C0454o m1963b(InterfaceC0096d keyDescriptor) {
        AbstractC6118n.m27187e(keyDescriptor, "keyDescriptor");
        return new C0454o("Value of type '" + keyDescriptor.mo371a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.mo374e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: c */
    public static final C0452m m1964c(int i7, String message) {
        AbstractC6118n.m27187e(message, "message");
        if (i7 >= 0) {
            message = "Unexpected JSON token at offset " + i7 + ": " + message;
        }
        return new C0452m(message);
    }

    /* JADX INFO: renamed from: d */
    public static final C0452m m1965d(int i7, String message, CharSequence input) {
        AbstractC6118n.m27187e(message, "message");
        AbstractC6118n.m27187e(input, "input");
        return m1964c(i7, message + "\nJSON input: " + ((Object) m1968g(input, i7)));
    }

    /* JADX INFO: renamed from: e */
    public static final Void m1966e(AbstractC0440a abstractC0440a, String entity) {
        AbstractC6118n.m27187e(abstractC0440a, "<this>");
        AbstractC6118n.m27187e(entity, "entity");
        abstractC0440a.m1916u("Trailing comma before the end of JSON " + entity, abstractC0440a.f1708a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new C1426d();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m1967f(AbstractC0440a abstractC0440a, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "object";
        }
        return m1966e(abstractC0440a, str);
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m1968g(CharSequence charSequence, int i7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i7 != -1) {
                int i8 = i7 - 30;
                int i9 = i7 + 30;
                return (i8 <= 0 ? "" : ".....") + charSequence.subSequence(AbstractC5905g.m26654b(i8, 0), AbstractC5905g.m26656d(i9, charSequence.length())).toString() + (i9 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ CharSequence m1969h(CharSequence charSequence, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        return m1968g(charSequence, i7);
    }

    /* JADX INFO: renamed from: i */
    public static final Void m1970i(AbstractC0440a abstractC0440a, Number result) {
        AbstractC6118n.m27187e(abstractC0440a, "<this>");
        AbstractC6118n.m27187e(result, "result");
        AbstractC0440a.m1894v(abstractC0440a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C1426d();
    }
}
