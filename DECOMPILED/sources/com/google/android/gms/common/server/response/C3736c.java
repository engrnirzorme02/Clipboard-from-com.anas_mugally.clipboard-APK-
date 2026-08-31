package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3747b;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.common.util.AbstractC3757l;
import com.google.android.gms.common.util.AbstractC3758m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p177X2.AbstractC1946b;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.c */
/* JADX INFO: loaded from: classes.dex */
public class C3736c extends AbstractC3735b {
    public static final Parcelable.Creator<C3736c> CREATOR = new C3744k();

    /* JADX INFO: renamed from: a */
    private final int f14880a;

    /* JADX INFO: renamed from: b */
    private final Parcel f14881b;

    /* JADX INFO: renamed from: c */
    private final int f14882c = 2;

    /* JADX INFO: renamed from: d */
    private final C3741h f14883d;

    /* JADX INFO: renamed from: e */
    private final String f14884e;

    /* JADX INFO: renamed from: f */
    private int f14885f;

    /* JADX INFO: renamed from: r */
    private int f14886r;

    C3736c(int i7, Parcel parcel, C3741h c3741h) {
        this.f14880a = i7;
        this.f14881b = (Parcel) AbstractC3718s.m18083l(parcel);
        this.f14883d = c3741h;
        this.f14884e = c3741h == null ? null : c3741h.m18138T();
        this.f14885f = 2;
    }

    /* JADX INFO: renamed from: e */
    private final void m18133e(AbstractC3734a.a aVar) {
        if (aVar.f14875r == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f14881b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i7 = this.f14885f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f14886r = AbstractC1947c.m8053a(parcel);
            this.f14885f = 1;
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m18134f(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((AbstractC3734a.a) entry.getValue()).m18125Z(), entry);
        }
        sb.append('{');
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean z7 = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(AbstractC1946b.m8036w(iM8002D));
            if (entry2 != null) {
                if (z7) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                AbstractC3734a.a aVar = (AbstractC3734a.a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (aVar.m18132h0()) {
                    int i7 = aVar.f14872d;
                    switch (i7) {
                        case 0:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, Integer.valueOf(AbstractC1946b.m8004F(parcel, iM8002D))));
                            break;
                        case 1:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, AbstractC1946b.m8016c(parcel, iM8002D)));
                            break;
                        case 2:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, Long.valueOf(AbstractC1946b.m8006H(parcel, iM8002D))));
                            break;
                        case 3:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, Float.valueOf(AbstractC1946b.m8000B(parcel, iM8002D))));
                            break;
                        case 4:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, Double.valueOf(AbstractC1946b.m8039z(parcel, iM8002D))));
                            break;
                        case 5:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, AbstractC1946b.m8014a(parcel, iM8002D)));
                            break;
                        case 6:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, Boolean.valueOf(AbstractC1946b.m8037x(parcel, iM8002D))));
                            break;
                        case 7:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, AbstractC1946b.m8030q(parcel, iM8002D)));
                            break;
                        case 8:
                        case 9:
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, AbstractC1946b.m8020g(parcel, iM8002D)));
                            break;
                        case 10:
                            Bundle bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleM8019f.keySet()) {
                                map2.put(str2, (String) AbstractC3718s.m18083l(bundleM8019f.getString(str2)));
                            }
                            m18136h(sb, aVar, AbstractC3734a.zaD(aVar, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i7);
                    }
                } else if (aVar.f14873e) {
                    sb.append("[");
                    switch (aVar.f14872d) {
                        case 0:
                            AbstractC3747b.m18148e(sb, AbstractC1946b.m8024k(parcel, iM8002D));
                            break;
                        case 1:
                            AbstractC3747b.m18150g(sb, AbstractC1946b.m8017d(parcel, iM8002D));
                            break;
                        case 2:
                            AbstractC3747b.m18149f(sb, AbstractC1946b.m8026m(parcel, iM8002D));
                            break;
                        case 3:
                            AbstractC3747b.m18147d(sb, AbstractC1946b.m8023j(parcel, iM8002D));
                            break;
                        case 4:
                            AbstractC3747b.m18146c(sb, AbstractC1946b.m8022i(parcel, iM8002D));
                            break;
                        case 5:
                            AbstractC3747b.m18150g(sb, AbstractC1946b.m8015b(parcel, iM8002D));
                            break;
                        case 6:
                            AbstractC3747b.m18151h(sb, AbstractC1946b.m8018e(parcel, iM8002D));
                            break;
                        case 7:
                            AbstractC3747b.m18152i(sb, AbstractC1946b.m8031r(parcel, iM8002D));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrM8028o = AbstractC1946b.m8028o(parcel, iM8002D);
                            int length = parcelArrM8028o.length;
                            for (int i8 = 0; i8 < length; i8++) {
                                if (i8 > 0) {
                                    sb.append(",");
                                }
                                parcelArrM8028o[i8].setDataPosition(0);
                                m18134f(sb, aVar.m18130f0(), parcelArrM8028o[i8]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (aVar.f14872d) {
                        case 0:
                            sb.append(AbstractC1946b.m8004F(parcel, iM8002D));
                            break;
                        case 1:
                            sb.append(AbstractC1946b.m8016c(parcel, iM8002D));
                            break;
                        case 2:
                            sb.append(AbstractC1946b.m8006H(parcel, iM8002D));
                            break;
                        case 3:
                            sb.append(AbstractC1946b.m8000B(parcel, iM8002D));
                            break;
                        case 4:
                            sb.append(AbstractC1946b.m8039z(parcel, iM8002D));
                            break;
                        case 5:
                            sb.append(AbstractC1946b.m8014a(parcel, iM8002D));
                            break;
                        case 6:
                            sb.append(AbstractC1946b.m8037x(parcel, iM8002D));
                            break;
                        case 7:
                            String strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                            sb.append("\"");
                            sb.append(AbstractC3757l.m18190a(strM8030q));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                            sb.append("\"");
                            sb.append(AbstractC3748c.m18155c(bArrM8020g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrM8020g2 = AbstractC1946b.m8020g(parcel, iM8002D);
                            sb.append("\"");
                            sb.append(AbstractC3748c.m18156d(bArrM8020g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleM8019f2 = AbstractC1946b.m8019f(parcel, iM8002D);
                            Set<String> setKeySet = bundleM8019f2.keySet();
                            sb.append("{");
                            boolean z8 = true;
                            for (String str3 : setKeySet) {
                                if (!z8) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(AbstractC3757l.m18190a(bundleM8019f2.getString(str3)));
                                sb.append("\"");
                                z8 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel parcelM8027n = AbstractC1946b.m8027n(parcel, iM8002D);
                            parcelM8027n.setDataPosition(0);
                            m18134f(sb, aVar.m18130f0(), parcelM8027n);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z7 = true;
            }
        }
        if (parcel.dataPosition() == iM8011M) {
            sb.append('}');
            return;
        }
        throw new AbstractC1946b.a("Overread allowed size end=" + iM8011M, parcel);
    }

    /* JADX INFO: renamed from: g */
    private static final void m18135g(StringBuilder sb, int i7, Object obj) {
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(AbstractC3757l.m18190a(AbstractC3718s.m18083l(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(AbstractC3748c.m18155c((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(AbstractC3748c.m18156d((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                AbstractC3758m.m18191a(sb, (HashMap) AbstractC3718s.m18083l(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i7);
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m18136h(StringBuilder sb, AbstractC3734a.a aVar, Object obj) {
        if (!aVar.f14871c) {
            m18135g(sb, aVar.f14870b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            m18135g(sb, aVar.f14870b, arrayList.get(i7));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final void addConcreteTypeArrayInternal(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((C3736c) ((AbstractC3734a) arrayList.get(i7))).m18137d());
        }
        AbstractC1947c.m8041B(this.f14881b, aVar.m18125Z(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final void addConcreteTypeInternal(AbstractC3734a.a aVar, String str, AbstractC3734a abstractC3734a) {
        m18133e(aVar);
        AbstractC1947c.m8040A(this.f14881b, aVar.m18125Z(), ((C3736c) abstractC3734a).m18137d(), true);
    }

    /* JADX INFO: renamed from: d */
    public final Parcel m18137d() {
        int i7 = this.f14885f;
        if (i7 == 0) {
            int iM8053a = AbstractC1947c.m8053a(this.f14881b);
            this.f14886r = iM8053a;
            AbstractC1947c.m8054b(this.f14881b, iM8053a);
            this.f14885f = 2;
        } else if (i7 == 1) {
            AbstractC1947c.m8054b(this.f14881b, this.f14886r);
            this.f14885f = 2;
        }
        return this.f14881b;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final Map getFieldMappings() {
        C3741h c3741h = this.f14883d;
        if (c3741h == null) {
            return null;
        }
        return c3741h.m18139U((String) AbstractC3718s.m18083l(this.f14884e));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3735b, com.google.android.gms.common.server.response.AbstractC3734a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3735b, com.google.android.gms.common.server.response.AbstractC3734a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setBooleanInternal(AbstractC3734a.a aVar, String str, boolean z7) {
        m18133e(aVar);
        AbstractC1947c.m8059g(this.f14881b, aVar.m18125Z(), z7);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setDecodedBytesInternal(AbstractC3734a.a aVar, String str, byte[] bArr) {
        m18133e(aVar);
        AbstractC1947c.m8063k(this.f14881b, aVar.m18125Z(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setIntegerInternal(AbstractC3734a.a aVar, String str, int i7) {
        m18133e(aVar);
        AbstractC1947c.m8072t(this.f14881b, aVar.m18125Z(), i7);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setLongInternal(AbstractC3734a.a aVar, String str, long j7) {
        m18133e(aVar);
        AbstractC1947c.m8076x(this.f14881b, aVar.m18125Z(), j7);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringInternal(AbstractC3734a.a aVar, String str, String str2) {
        m18133e(aVar);
        AbstractC1947c.m8044E(this.f14881b, aVar.m18125Z(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringMapInternal(AbstractC3734a.a aVar, String str, Map map) {
        m18133e(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) AbstractC3718s.m18083l(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        AbstractC1947c.m8062j(this.f14881b, aVar.m18125Z(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringsInternal(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = (String) arrayList.get(i7);
        }
        AbstractC1947c.m8045F(this.f14881b, aVar.m18125Z(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final String toString() {
        AbstractC3718s.m18084m(this.f14883d, "Cannot convert to JSON on client side.");
        Parcel parcelM18137d = m18137d();
        parcelM18137d.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m18134f(sb, (Map) AbstractC3718s.m18083l(this.f14883d.m18139U((String) AbstractC3718s.m18083l(this.f14884e))), parcelM18137d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C3741h c3741h;
        int i8 = this.f14880a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8040A(parcel, 2, m18137d(), false);
        int i9 = this.f14882c;
        if (i9 != 0) {
            c3741h = i9 != 1 ? this.f14883d : this.f14883d;
        } else {
            c3741h = null;
        }
        AbstractC1947c.m8042C(parcel, 3, c3741h, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zab(AbstractC3734a.a aVar, String str, BigDecimal bigDecimal) {
        m18133e(aVar);
        AbstractC1947c.m8055c(this.f14881b, aVar.m18125Z(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zad(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        AbstractC1947c.m8056d(this.f14881b, aVar.m18125Z(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zaf(AbstractC3734a.a aVar, String str, BigInteger bigInteger) {
        m18133e(aVar);
        AbstractC1947c.m8057e(this.f14881b, aVar.m18125Z(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zah(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        AbstractC1947c.m8058f(this.f14881b, aVar.m18125Z(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zak(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        AbstractC1947c.m8060h(this.f14881b, aVar.m18125Z(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zan(AbstractC3734a.a aVar, String str, double d7) {
        m18133e(aVar);
        AbstractC1947c.m8065m(this.f14881b, aVar.m18125Z(), d7);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zap(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        AbstractC1947c.m8066n(this.f14881b, aVar.m18125Z(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zar(AbstractC3734a.a aVar, String str, float f7) {
        m18133e(aVar);
        AbstractC1947c.m8068p(this.f14881b, aVar.m18125Z(), f7);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zat(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        AbstractC1947c.m8069q(this.f14881b, aVar.m18125Z(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zaw(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        AbstractC1947c.m8073u(this.f14881b, aVar.m18125Z(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void zaz(AbstractC3734a.a aVar, String str, ArrayList arrayList) {
        m18133e(aVar);
        int size = ((ArrayList) AbstractC3718s.m18083l(arrayList)).size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        AbstractC1947c.m8077y(this.f14881b, aVar.m18125Z(), jArr, true);
    }
}
