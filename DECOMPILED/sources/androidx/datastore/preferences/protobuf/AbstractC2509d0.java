package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2509d0 {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0$a */
    class a implements b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2512f f9508a;

        a(AbstractC2512f abstractC2512f) {
            this.f9508a = abstractC2512f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2509d0.b
        /* JADX INFO: renamed from: a */
        public byte mo11134a(int i7) {
            return this.f9508a.mo11148b(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2509d0.b
        public int size() {
            return this.f9508a.size();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0$b */
    private interface b {
        /* JADX INFO: renamed from: a */
        byte mo11134a(int i7);

        int size();
    }

    /* JADX INFO: renamed from: a */
    static String m11131a(AbstractC2512f abstractC2512f) {
        return m11132b(new a(abstractC2512f));
    }

    /* JADX INFO: renamed from: b */
    static String m11132b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            byte bMo11134a = bVar.mo11134a(i7);
            if (bMo11134a == 34) {
                sb.append("\\\"");
            } else if (bMo11134a == 39) {
                sb.append("\\'");
            } else if (bMo11134a != 92) {
                switch (bMo11134a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo11134a < 32 || bMo11134a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo11134a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo11134a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo11134a & 7) + 48));
                        } else {
                            sb.append((char) bMo11134a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    static String m11133c(String str) {
        return m11131a(AbstractC2512f.m11145m(str));
    }
}
