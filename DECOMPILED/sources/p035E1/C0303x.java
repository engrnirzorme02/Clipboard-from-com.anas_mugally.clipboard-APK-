package p035E1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p019C1.C0132h;
import p019C1.InterfaceC0130f;
import p019C1.InterfaceC0136l;
import p043F1.InterfaceC0404b;
import p183Y1.AbstractC2023l;
import p183Y1.C2019h;

/* JADX INFO: renamed from: E1.x */
/* JADX INFO: loaded from: classes.dex */
final class C0303x implements InterfaceC0130f {

    /* JADX INFO: renamed from: j */
    private static final C2019h f1265j = new C2019h(50);

    /* JADX INFO: renamed from: b */
    private final InterfaceC0404b f1266b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0130f f1267c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0130f f1268d;

    /* JADX INFO: renamed from: e */
    private final int f1269e;

    /* JADX INFO: renamed from: f */
    private final int f1270f;

    /* JADX INFO: renamed from: g */
    private final Class f1271g;

    /* JADX INFO: renamed from: h */
    private final C0132h f1272h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC0136l f1273i;

    C0303x(InterfaceC0404b interfaceC0404b, InterfaceC0130f interfaceC0130f, InterfaceC0130f interfaceC0130f2, int i7, int i8, InterfaceC0136l interfaceC0136l, Class cls, C0132h c0132h) {
        this.f1266b = interfaceC0404b;
        this.f1267c = interfaceC0130f;
        this.f1268d = interfaceC0130f2;
        this.f1269e = i7;
        this.f1270f = i8;
        this.f1273i = interfaceC0136l;
        this.f1271g = cls;
        this.f1272h = c0132h;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    private byte[] m1467c() {
        C2019h c2019h = f1265j;
        byte[] bArr = (byte[]) c2019h.m8396g(this.f1271g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f1271g.getName().getBytes(InterfaceC0130f.f689a);
        c2019h.m8398k(this.f1271g, bytes);
        return bytes;
    }

    @Override // p019C1.InterfaceC0130f
    /* JADX INFO: renamed from: a */
    public void mo590a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f1266b.mo1737c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f1269e).putInt(this.f1270f).array();
        this.f1268d.mo590a(messageDigest);
        this.f1267c.mo590a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC0136l interfaceC0136l = this.f1273i;
        if (interfaceC0136l != null) {
            interfaceC0136l.mo590a(messageDigest);
        }
        this.f1272h.mo590a(messageDigest);
        messageDigest.update(m1467c());
        this.f1266b.mo1738d(bArr);
    }

    @Override // p019C1.InterfaceC0130f
    public boolean equals(Object obj) {
        if (obj instanceof C0303x) {
            C0303x c0303x = (C0303x) obj;
            if (this.f1270f == c0303x.f1270f && this.f1269e == c0303x.f1269e && AbstractC2023l.m8413d(this.f1273i, c0303x.f1273i) && this.f1271g.equals(c0303x.f1271g) && this.f1267c.equals(c0303x.f1267c) && this.f1268d.equals(c0303x.f1268d) && this.f1272h.equals(c0303x.f1272h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019C1.InterfaceC0130f
    public int hashCode() {
        int iHashCode = (((((this.f1267c.hashCode() * 31) + this.f1268d.hashCode()) * 31) + this.f1269e) * 31) + this.f1270f;
        InterfaceC0136l interfaceC0136l = this.f1273i;
        if (interfaceC0136l != null) {
            iHashCode = (iHashCode * 31) + interfaceC0136l.hashCode();
        }
        return (((iHashCode * 31) + this.f1271g.hashCode()) * 31) + this.f1272h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f1267c + ", signature=" + this.f1268d + ", width=" + this.f1269e + ", height=" + this.f1270f + ", decodedResourceClass=" + this.f1271g + ", transformation='" + this.f1273i + "', options=" + this.f1272h + '}';
    }
}
