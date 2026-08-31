package p284k4;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p086K4.InterfaceC0745a;
import p102M4.C0899d;
import p276j4.AbstractC5868F;
import p276j4.C5870a;

/* JADX INFO: renamed from: k4.j */
/* JADX INFO: loaded from: classes.dex */
public class C6065j {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0745a f23835a = new C0899d().m4077j(C5870a.f23061a).m4078k(true).m4076i();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4.j$a */
    interface a {
        /* JADX INFO: renamed from: a */
        Object mo27061a(JsonReader jsonReader);
    }

    /* JADX INFO: renamed from: A */
    private static AbstractC5868F.e.d.f m27062A(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.f.a aVarM26591a = AbstractC5868F.e.d.f.m26591a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarM26591a.mo26594b(m27084n(jsonReader, new a() { // from class: k4.f
                    @Override // p284k4.C6065j.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo27061a(JsonReader jsonReader2) {
                        return C6065j.m27096z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26591a.mo26593a();
    }

    /* JADX INFO: renamed from: B */
    private static AbstractC5868F.e.d.a.b.AbstractC7703d m27063B(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.AbstractC7703d.AbstractC7704a abstractC7704aM26512a = AbstractC5868F.e.d.a.b.AbstractC7703d.m26512a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC7704aM26512a.mo26517b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC7704aM26512a.mo26518c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC7704aM26512a.mo26519d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7704aM26512a.mo26516a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static AbstractC5868F.e.d.a.b.AbstractC7705e m27064C(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a abstractC7706aM26520a = AbstractC5868F.e.d.a.b.AbstractC7705e.m26520a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC7706aM26520a.mo26525b(m27084n(jsonReader, new C6064i()));
                    break;
                case "name":
                    abstractC7706aM26520a.mo26527d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC7706aM26520a.mo26526c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7706aM26520a.mo26524a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static AbstractC5868F.d.b m27065D(JsonReader jsonReader) throws IOException {
        AbstractC5868F.d.b.a aVarM26378a = AbstractC5868F.d.b.m26378a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarM26378a.mo26383c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarM26378a.mo26382b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26378a.mo26381a();
    }

    /* JADX INFO: renamed from: E */
    private static AbstractC5868F.d m27066E(JsonReader jsonReader) throws IOException {
        AbstractC5868F.d.a aVarM26372a = AbstractC5868F.d.m26372a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarM26372a.mo26376b(m27084n(jsonReader, new a() { // from class: k4.e
                    @Override // p284k4.C6065j.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo27061a(JsonReader jsonReader2) {
                        return C6065j.m27065D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarM26372a.mo26377c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26372a.mo26375a();
    }

    /* JADX INFO: renamed from: F */
    private static AbstractC5868F.e.AbstractC7712e m27067F(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.AbstractC7712e.a aVarM26595a = AbstractC5868F.e.AbstractC7712e.m26595a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarM26595a.mo26601b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarM26595a.mo26602c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarM26595a.mo26604e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarM26595a.mo26603d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM26595a.mo26600a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static AbstractC5868F.e.d.a.c m27068G(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.c.AbstractC7709a abstractC7709aM26540a = AbstractC5868F.e.d.a.c.m26540a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC7709aM26540a.mo26548d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC7709aM26540a.mo26549e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC7709aM26540a.mo26546b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC7709aM26540a.mo26547c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7709aM26540a.mo26545a();
    }

    /* JADX INFO: renamed from: H */
    private static AbstractC5868F m27069H(JsonReader jsonReader) throws IOException {
        AbstractC5868F.b bVarM26304b = AbstractC5868F.m26304b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarM26304b.mo26362j(m27066E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarM26304b.mo26364l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarM26304b.mo26355c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarM26304b.mo26354b(m27083m(jsonReader));
                    break;
                case "buildVersion":
                    bVarM26304b.mo26356d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarM26304b.mo26358f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarM26304b.mo26360h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarM26304b.mo26361i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarM26304b.mo26359g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarM26304b.mo26363k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarM26304b.mo26357e(jsonReader.nextString());
                    break;
                case "session":
                    bVarM26304b.mo26365m(m27071J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM26304b.mo26353a();
    }

    /* JADX INFO: renamed from: I */
    private static AbstractC5868F.e.d.AbstractC7711e.b m27070I(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.AbstractC7711e.b.a aVarM26585a = AbstractC5868F.e.d.AbstractC7711e.b.m26585a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarM26585a.mo26590c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarM26585a.mo26589b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26585a.mo26588a();
    }

    /* JADX INFO: renamed from: J */
    private static AbstractC5868F.e m27071J(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.b bVarM26384a = AbstractC5868F.e.m26384a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarM26384a.mo26429m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarM26384a.mo26419c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarM26384a.m26427k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarM26384a.mo26422f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarM26384a.mo26421e(m27087q(jsonReader));
                    break;
                case "events":
                    bVarM26384a.mo26423g(m27084n(jsonReader, new a() { // from class: k4.d
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27088r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarM26384a.mo26428l(m27067F(jsonReader));
                    break;
                case "app":
                    bVarM26384a.mo26418b(m27082l(jsonReader));
                    break;
                case "user":
                    bVarM26384a.mo26430n(m27072K(jsonReader));
                    break;
                case "generator":
                    bVarM26384a.mo26424h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarM26384a.mo26420d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarM26384a.mo26425i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM26384a.mo26417a();
    }

    /* JADX INFO: renamed from: K */
    private static AbstractC5868F.e.f m27072K(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.f.a aVarM26605a = AbstractC5868F.e.f.m26605a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarM26605a.mo26281b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26605a.mo26280a();
    }

    /* JADX INFO: renamed from: l */
    private static AbstractC5868F.e.a m27082l(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.a.AbstractC7697a abstractC7697aM26402a = AbstractC5868F.e.a.m26402a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC7697aM26402a.mo26414e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC7697aM26402a.mo26411b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC7697aM26402a.mo26412c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC7697aM26402a.mo26416g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC7697aM26402a.mo26415f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC7697aM26402a.mo26413d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7697aM26402a.mo26410a();
    }

    /* JADX INFO: renamed from: m */
    private static AbstractC5868F.a m27083m(JsonReader jsonReader) throws IOException {
        AbstractC5868F.a.b bVarM26325a = AbstractC5868F.a.m26325a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarM26325a.mo26344b(m27084n(jsonReader, new a() { // from class: k4.a
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27085o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarM26325a.mo26346d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarM26325a.mo26348f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarM26325a.mo26350h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarM26325a.mo26351i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarM26325a.mo26347e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarM26325a.mo26349g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarM26325a.mo26352j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarM26325a.mo26345c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM26325a.mo26343a();
    }

    /* JADX INFO: renamed from: n */
    private static List m27084n(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo27061a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static AbstractC5868F.a.AbstractC7695a m27085o(JsonReader jsonReader) throws IOException {
        AbstractC5868F.a.AbstractC7695a.AbstractC7696a abstractC7696aM26335a = AbstractC5868F.a.AbstractC7695a.m26335a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC7696aM26335a.mo26342d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC7696aM26335a.mo26340b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC7696aM26335a.mo26341c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7696aM26335a.mo26339a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static AbstractC5868F.c m27086p(JsonReader jsonReader) throws IOException {
        AbstractC5868F.c.a aVarM26366a = AbstractC5868F.c.m26366a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarM26366a.mo26370b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarM26366a.mo26371c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26366a.mo26369a();
    }

    /* JADX INFO: renamed from: q */
    private static AbstractC5868F.e.c m27087q(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.c.a aVarM26431a = AbstractC5868F.e.c.m26431a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarM26431a.mo26449i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarM26431a.mo26445e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarM26431a.mo26448h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarM26431a.mo26442b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarM26431a.mo26444d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarM26431a.mo26443c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarM26431a.mo26446f(jsonReader.nextString());
                    break;
                case "state":
                    aVarM26431a.mo26450j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarM26431a.mo26447g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM26431a.mo26441a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static AbstractC5868F.e.d m27088r(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.b bVarM26451a = AbstractC5868F.e.d.m26451a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarM26451a.mo26552c(m27091u(jsonReader));
                    break;
                case "rollouts":
                    bVarM26451a.mo26554e(m27062A(jsonReader));
                    break;
                case "app":
                    bVarM26451a.mo26551b(m27089s(jsonReader));
                    break;
                case "log":
                    bVarM26451a.mo26553d(m27095y(jsonReader));
                    break;
                case "type":
                    bVarM26451a.mo26556g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarM26451a.mo26555f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM26451a.mo26550a();
    }

    /* JADX INFO: renamed from: s */
    private static AbstractC5868F.e.d.a m27089s(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.AbstractC7698a abstractC7698aM26459a = AbstractC5868F.e.d.a.m26459a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC7698aM26459a.mo26469b(m27084n(jsonReader, new a() { // from class: k4.c
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27068G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC7698aM26459a.mo26470c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC7698aM26459a.mo26473f(m27092v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC7698aM26459a.mo26474g(m27084n(jsonReader, new a() { // from class: k4.b
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27086p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC7698aM26459a.mo26472e(m27084n(jsonReader, new a() { // from class: k4.b
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27086p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC7698aM26459a.mo26475h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC7698aM26459a.mo26471d(m27068G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7698aM26459a.mo26468a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static AbstractC5868F.e.d.a.b.AbstractC7699a m27090t(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.AbstractC7699a.AbstractC7700a abstractC7700aM26482a = AbstractC5868F.e.d.a.b.AbstractC7699a.m26482a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC7700aM26482a.mo26490c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC7700aM26482a.mo26491d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC7700aM26482a.m26493f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC7700aM26482a.mo26489b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7700aM26482a.mo26488a();
    }

    /* JADX INFO: renamed from: u */
    private static AbstractC5868F.e.d.c m27091u(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.c.a aVarM26557a = AbstractC5868F.e.d.c.m26557a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarM26557a.mo26565b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarM26557a.mo26566c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarM26557a.mo26568e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarM26557a.mo26567d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarM26557a.mo26570g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarM26557a.mo26569f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM26557a.mo26564a();
    }

    /* JADX INFO: renamed from: v */
    private static AbstractC5868F.e.d.a.b m27092v(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.AbstractC7701b abstractC7701bM26476a = AbstractC5868F.e.d.a.b.m26476a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC7701bM26476a.mo26495b(m27083m(jsonReader));
                    break;
                case "threads":
                    abstractC7701bM26476a.mo26499f(m27084n(jsonReader, new a() { // from class: k4.g
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27064C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC7701bM26476a.mo26498e(m27063B(jsonReader));
                    break;
                case "binaries":
                    abstractC7701bM26476a.mo26496c(m27084n(jsonReader, new a() { // from class: k4.h
                        @Override // p284k4.C6065j.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo27061a(JsonReader jsonReader2) {
                            return C6065j.m27090t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC7701bM26476a.mo26497d(m27093w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7701bM26476a.mo26494a();
    }

    /* JADX INFO: renamed from: w */
    private static AbstractC5868F.e.d.a.b.c m27093w(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.c.AbstractC7702a abstractC7702aM26500a = AbstractC5868F.e.d.a.b.c.m26500a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC7702aM26500a.mo26508c(m27084n(jsonReader, new C6064i()));
                    break;
                case "reason":
                    abstractC7702aM26500a.mo26510e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC7702aM26500a.mo26511f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC7702aM26500a.mo26507b(m27093w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC7702aM26500a.mo26509d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7702aM26500a.mo26506a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b m27094x(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a abstractC7708aM26528a = AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.m26528a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC7708aM26528a.mo26537d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC7708aM26528a.mo26539f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC7708aM26528a.mo26538e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC7708aM26528a.mo26535b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC7708aM26528a.mo26536c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC7708aM26528a.mo26534a();
    }

    /* JADX INFO: renamed from: y */
    private static AbstractC5868F.e.d.AbstractC7710d m27095y(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.AbstractC7710d.a aVarM26571a = AbstractC5868F.e.d.AbstractC7710d.m26571a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarM26571a.mo26574b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM26571a.mo26573a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static AbstractC5868F.e.d.AbstractC7711e m27096z(JsonReader jsonReader) throws IOException {
        AbstractC5868F.e.d.AbstractC7711e.a aVarM26575a = AbstractC5868F.e.d.AbstractC7711e.m26575a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarM26575a.mo26581b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarM26575a.mo26584e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarM26575a.mo26583d(m27070I(jsonReader));
                    break;
                case "parameterValue":
                    aVarM26575a.mo26582c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM26575a.mo26580a();
    }

    /* JADX INFO: renamed from: L */
    public AbstractC5868F m27097L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC5868F abstractC5868FM27069H = m27069H(jsonReader);
                jsonReader.close();
                return abstractC5868FM27069H;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX INFO: renamed from: M */
    public String m27098M(AbstractC5868F abstractC5868F) {
        return f23835a.mo3507b(abstractC5868F);
    }

    /* JADX INFO: renamed from: j */
    public AbstractC5868F.e.d m27099j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC5868F.e.d dVarM27088r = m27088r(jsonReader);
                jsonReader.close();
                return dVarM27088r;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    /* JADX INFO: renamed from: k */
    public String m27100k(AbstractC5868F.e.d dVar) {
        return f23835a.mo3507b(dVar);
    }
}
