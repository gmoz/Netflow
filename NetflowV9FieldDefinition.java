/**
 *
 * @author Gmoz
 */
 
package model;
 
public class NetflowV9FieldDefinition {

    /*        
        *   NetFlow Version 9 Flow-Record Format
        *   105 to 127 **Reserved for future use by cisco**   
     */
//Incoming counter with length N x 8 bits for number of bytes associated with an IP Flow.
//Length: N (default is 4)
    public static int IN_BYTES = 1;
//Incoming counter with length N x 8 bits for the number of packets associated with an IP Flow
//Length: N (default is 4)
    public static int IN_PKTS = 2;
//Number of flows that were aggregated; default for N is 4
//Length: N
    public static int FLOWS = 3;
//IP protocol byte
//Length: 1
    public static int PROTOCOL = 4;
//Type of Service byte setting when entering incoming interface
//Length: 1
    public static int SRC_TOS = 5;
//Cumulative of all the TCP flags seen for this flow
//Length: 1
    public static int TCP_FLAGS = 6;
//TCP/UDP source port number i.e.: FTP, Telnet, or equivalent
//Length: 2
    public static int L4_SRC_PORT = 7;
//IPv4 source address
//Length: 4
    public static int IPV4_SRC_ADDR = 8;
//The number of contiguous bits in the source address subnet mask i.e.: the submask in slash notation
//Length: 1
    public static int SRC_MASK = 9;
//Input interface index; default for N is 2 but higher values could be used
//Length: N
    public static int INPUT_SNMP = 10;
//TCP/UDP destination port number i.e.: FTP, Telnet, or equivalent
//Length: 2
    public static int L4_DST_PORT = 11;
//IPv4 destination address
//Length: 4
    public static int IPV4_DST_ADDR = 12;
//The number of contiguous bits in the destination address subnet mask i.e.: the submask in slash notation
//Length: 1
    public static int DST_MASK = 13;
//Output interface index; default for N is 2 but higher values could be used
//Length: N
    public static int OUTPUT_SNMP = 14;
//IPv4 address of next-hop router
//Length: 4
    public static int IPV4_NEXT_HOP = 15;
//Source BGP autonomous system number where N could be 2 or 4
//Length: N (default is 2)
    public static int SRC_AS = 16;
//Destination BGP autonomous system number where N could be 2 or 4
//Length: N (default is 2)
    public static int DST_AS = 17;
//Next-hop router's IP in the BGP domain
//Length: 4
    public static int BGP_IPV4_NEXT_HOP = 18;
//IP multicast outgoing packet counter with length N x 8 bits for packets associated with the IP Flow
//Length: N (default is 4)
    public static int MUL_DST_PKTS = 19;
//IP multicast outgoing byte counter with length N x 8 bits for bytes associated with the IP Flow
//Length: N (default is 4)
    public static int MUL_DST_BYTES = 20;
//System uptime at which the last packet of this flow was switched
//Length: 4
    public static int LAST_SWITCHED = 21;
//System uptime at which the first packet of this flow was switched
//Length: 4
    public static int FIRST_SWITCHED = 22;
//Outgoing counter with length N x 8 bits for the number of bytes associated with an IP Flow
//Length: N (default is 4)
    public static int OUT_BYTES = 23;
//Outgoing counter with length N x 8 bits for the number of packets associated with an IP Flow.
//Length: N (default is 4)
    public static int OUT_PKTS = 24;
//Minimum IP packet length on incoming packets of the flow
//Length: 2
    public static int MIN_PKT_LNGTH = 25;
//Maximum IP packet length on incoming packets of the flow
//Length: 2
    public static int MAX_PKT_LNGTH = 26;
//IPv6 Source Address
//Length: 16
    public static int IPV6_SRC_ADDR = 27;
//IPv6 Destination Address
//Length: 16
    public static int IPV6_DST_ADDR = 28;
//Length of the IPv6 source mask in contiguous bits
//Length: 1
    public static int IPV6_SRC_MASK = 29;
//Length of the IPv6 destination mask in contiguous bits
//Length: 1
    public static int IPV6_DST_MASK = 30;
//IPv6 flow label as per RFC 2460 definition
//Length: 3
    public static int IPV6_FLOW_LABEL = 31;
//Internet Control Message Protocol (ICMP) packet type; reported as ((ICMP Type*256) + ICMP code)
//Length: 2
    public static int ICMP_TYPE = 32;
//Internet Group Management Protocol (IGMP) packet type
//Length: 1
    public static int MUL_IGMP_TYPE = 33;
//When using sampled NetFlow, the rate at which packets are sampled i.e.: a value of 100 indicates that one of every 100 packets is sampled
//Length: 4
    public static int SAMPLING_INTERVAL = 34;
//The type of algorithm used for sampled NetFlow: 0x01 Deterministic Sampling ,0x02 Random Sampling
//Length: 1
    public static int SAMPLING_ALGORITHM = 35;
//Timeout value (in seconds) for active flow entries in the NetFlow cache
//Length: 2
    public static int FLOW_ACTIVE_TIMEOUT = 36;
//Timeout value (in seconds) for inactive flow entries in the NetFlow cache
//Length: 2
    public static int FLOW_INACTIVE_TIMEOUT = 37;
//Type of flow switching engine: RP = 0, VIP/Linecard = 1
//Length: 1
    public static int ENGINE_TYPE = 38;
//ID number of the flow switching engine
//Length: 1
    public static int ENGINE_ID = 39;
//Counter with length N x 8 bits for bytes for the number of bytes exported by the Observation Domain
//Length: N (default is 4)
    public static int TOTAL_BYTES_EXP = 40;
//Counter with length N x 8 bits for bytes for the number of packets exported by the Observation Domain
//Length: N (default is 4)
    public static int TOTAL_PKTS_EXP = 41;
//Counter with length N x 8 bits for bytes for the number of flows exported by the Observation Domain
//Length: N (default is 4)
    public static int TOTAL_FLOWS_EXP = 42;

//IPv4 source address prefix (specific for Catalyst architecture)
//Length: 4
    public static int IPV4_SRC_PREFIX = 44;
//IPv4 destination address prefix (specific for Catalyst architecture)
//Length: 4
    public static int IPV4_DST_PREFIX = 45;
//MPLS Top Label Type: 0x00 UNKNOWN 0x01 TE-MIDPT 0x02 ATOM 0x03 VPN 0x04 BGP 0x05 LDP
//Length: 1
    public static int MPLS_TOP_LABEL_TYPE = 46;
//Forwarding Equivalent Class corresponding to the MPLS Top Label
//Length: 4
    public static int MPLS_TOP_LABEL_IP_ADDR = 47;
//Identifier shown in ""show flow-sampler""
//Length: 1
    public static int FLOW_SAMPLER_ID = 48;
//The type of algorithm used for sampling data: 0x02 random sampling. Use in connection with FLOW_SAMPLER_MODE
//Length: 1
    public static int FLOW_SAMPLER_MODE = 49;
//Packet interval at which to sample. Use in connection with FLOW_SAMPLER_MODE
//Length: 4
    public static int FLOW_SAMPLER_RANDOM_INTERVAL = 50;
//Minimum TTL on incoming packets of the flow
//Length: 1
    public static int MIN_TTL = 52;
//Maximum TTL on incoming packets of the flow
//Length: 1
    public static int MAX_TTL = 53;
//The IP v4 identification field
//Length: 2
    public static int IPV4_IDENT = 54;
//Type of Service byte setting when exiting outgoing interface
//Length: 1
    public static int DST_TOS = 55;
//Incoming source MAC address
//Length: 6
    public static int IN_SRC_MAC = 56;
//Outgoing destination MAC address
//Length: 6
    public static int OUT_DST_MAC = 57;
//Virtual LAN identifier associated with ingress interface
//Length: 2
    public static int SRC_VLAN = 58;
//Virtual LAN identifier associated with egress interface
//Length: 2
    public static int DST_VLAN = 59;
//Internet Protocol Version Set to 4 for IPv4, set to 6 for IPv6. If not present in the template, then version 4 is assumed.
//Length: 1
    public static int IP_PROTOCOL_VERSION = 60;
//Flow direction: 0 - ingress flow, 1 - egress flow
//Length: 1
    public static int DIRECTION = 61;
//IPv6 address of the next-hop router
//Length: 16
    public static int IPV6_NEXT_HOP = 62;
//Next-hop router in the BGP domain
//Length: 16
    public static int BPG_IPV6_NEXT_HOP = 63;
//Bit-encoded field identifying IPv6 option headers found in the flow
//Length: 4
    public static int IPV6_OPTION_HEADERS = 64;
//MPLS label at position 1 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_1 = 70;
//MPLS label at position 2 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_2 = 71;
//MPLS label at position 3 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_3 = 72;
//MPLS label at position 4 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_4 = 73;
//MPLS label at position 5 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_5 = 74;
//MPLS label at position 6 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_6 = 75;
//MPLS label at position 7 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_7 = 76;
//MPLS label at position 8 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_8 = 77;
//MPLS label at position 9 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_9 = 78;
//MPLS label at position 10 in the stack. This comprises 20 bits of MPLS label, 3 EXP (experimental) bits and 1 S (end-of-stack) bit.
//Length: 3
    public static int MPLS_LABEL_10 = 79;
//Incoming destination MAC address
//Length: 6
    public static int IN_DST_MAC = 80;
//Outgoing source MAC address
//Length: 6
    public static int OUT_SRC_MAC = 81;
//Shortened interface name i.e.: ""FE1/0""
//Length: N
    public static int IF_NAME = 82;
//Full interface name i.e.: ""'FastEthernet 1/0""
//Length: N (default specified in template)
    public static int IF_DESC = 83;
//Name of the flow sampler
//Length: N (default specified in template)
    public static int SAMPLER_NAME = 84;
//Running byte counter for a permanent flow
//Length: N (default is 4)
    public static int IN_PERMANENT_BYTES = 85;
//Running packet counter for a permanent flow
//Length: N (default is 4)
    public static int IN_PERMANENT_PKTS = 86;
//The fragment-offset value from fragmented IP packets
//Length: 2
    public static int FRAGMENT_OFFSET = 88;
//Forwarding status is encoded on 1 byte with the 2 left bits giving the status and the 6 remaining bits giving the reason code.
//Length: 1
    public static int FORWARDING_STATUS = 89;
//MPLS PAL Route Distinguisher.
//Length: 8 (array)
    public static int MPLS_PAL_RD = 90;
//Number of consecutive bits in the MPLS prefix length.
//Length: 1
    public static int MPLS_PREFIX_LEN = 91;
//BGP Policy Accounting Source Traffic Index
//Length: 4
    public static int SRC_TRAFFIC_INDEX = 92;
//BGP Policy Accounting Destination Traffic Index
//Length: 4
    public static int DST_TRAFFIC_INDEX = 93;
//Application description.
//Length: N
    public static int APPLICATION_DESCRIPTION = 94;
//8 bits of engine ID, followed by n bits of classification.
//Length: 1+n
    public static int APPLICATION_TAG = 95;
//Name associated with a classification.
//Length: N
    public static int APPLICATION_NAME = 96;
//The value of a Differentiated Services Code Point (DSCP) encoded in the Differentiated Services Field, after modification.
//Length: 1
    public static int postipDiffServCodePoint = 98;
//Multicast replication factor.
//Length: 4
    public static int replicationFactor = 99;
//DEPRECATED
//Length: N
    public static int DEPRECATED = 100;
//Layer 2 packet section offset. Potentially a generic offset.
//Length: 
    public static int layer2packetSectionOffset = 102;
//Layer 2 packet section size. Potentially a generic size.
//Length: 
    public static int layer2packetSectionSize = 103;
//Layer 2 packet section data.
//Length: 
    public static int layer2packetSectionData = 104;

}
