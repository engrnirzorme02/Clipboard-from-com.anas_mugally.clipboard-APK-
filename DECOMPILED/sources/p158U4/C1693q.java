package p158U4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: U4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1693q extends AbstractC1681e {

    /* JADX INFO: renamed from: b */
    public static final C1693q f5616b = m7118A("__name__");

    /* JADX INFO: renamed from: c */
    public static final C1693q f5617c = new C1693q(Collections.EMPTY_LIST);

    private C1693q(List list) {
        super(list);
    }

    /* JADX INFO: renamed from: A */
    public static C1693q m7118A(String str) {
        return new C1693q(Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: C */
    private static boolean m7119C(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i7 = 1; i7 < str.length(); i7++) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static C1693q m7120z(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        boolean z7 = false;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\\') {
                i7++;
                if (i7 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i7));
            } else if (cCharAt == '.') {
                if (z7) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z7 = !z7;
            } else {
                sb.append(cCharAt);
            }
            i7++;
        }
        String string2 = sb.toString();
        if (!string2.isEmpty()) {
            arrayList.add(string2);
            return new C1693q(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    /* JADX INFO: renamed from: B */
    public boolean m7121B() {
        return equals(f5616b);
    }

    @Override // p158U4.AbstractC1681e
    /* JADX INFO: renamed from: h */
    public String mo7057h() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < this.f5596a.size(); i7++) {
            if (i7 > 0) {
                sb.append(".");
            }
            String strReplace = ((String) this.f5596a.get(i7)).replace("\\", "\\\\").replace("`", "\\`");
            if (!m7119C(strReplace)) {
                strReplace = '`' + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158U4.AbstractC1681e
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1693q mo7059m(List list) {
        return new C1693q(list);
    }
}
